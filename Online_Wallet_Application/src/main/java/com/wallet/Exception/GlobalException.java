package com.wallet.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException  {

@ExceptionHandler(CustomerException.class)
ResponseEntity<MyErrorDetails> customerExceptionHandler(CustomerException i, WebRequest webrequest){
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now() ,i.getMessage() ,webrequest.getDescription(false));
//	MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),);
return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	
}

@ExceptionHandler(AccountHandlerException.class)
ResponseEntity<MyErrorDetails> account_handler_ExceptionHandler(AccountHandlerException i, WebRequest webrequest){
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now() ,i.getMessage() ,webrequest.getDescription(false));
//	MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),);
return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	
}

@ExceptionHandler(NoHandlerFoundException.class)
ResponseEntity<MyErrorDetails> noHandlerExceptionHandler(NoHandlerFoundException customerException, WebRequest webRequest) {
    MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), customerException.getMessage(), webRequest.getDescription(false));
    return new ResponseEntity<>(myErrorDetails, HttpStatus.NOT_FOUND);
}

@ExceptionHandler(MethodArgumentNotValidException.class)
ResponseEntity<MyErrorDetails> methodArgumentExceptionHandler(MethodArgumentNotValidException customerException, WebRequest webRequest) {
    MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), "Validation Error", customerException.getBindingResult().getFieldError().getDefaultMessage());
    return new ResponseEntity<>(myErrorDetails, HttpStatus.NOT_FOUND);
}

@ExceptionHandler(Exception.class)
ResponseEntity<MyErrorDetails> mainExceptionHandler(Exception customerException, WebRequest webRequest) {
    MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDateTime.now(), customerException.getMessage(), webRequest.getDescription(false));
    return new ResponseEntity<>(myErrorDetails, HttpStatus.NOT_FOUND);
}


}
