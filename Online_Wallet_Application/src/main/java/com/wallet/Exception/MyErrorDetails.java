package com.wallet.Exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorDetails {
	
private LocalDateTime TimeStamp;
private String Details;
private String msg;

public MyErrorDetails() {
	// TODO Auto-generated constructor stub
}

public MyErrorDetails(LocalDateTime timeStamp, String details, String msg) {
	super();
	TimeStamp = timeStamp;
	Details = details;
	this.msg = msg;
}

public LocalDateTime getTimeStamp() {
	return TimeStamp;
}

public void setTimeStamp(LocalDateTime timeStamp) {
	TimeStamp = timeStamp;
}

public String getDetails() {
	return Details;
}

@Override
public String toString() {
	return "MyErrorDetails [TimeStamp=" + TimeStamp + ", Details=" + Details + ", msg=" + msg + "]";
}

public void setDetails(String details) {
	Details = details;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}





}
