package com.wallet.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.wallet.Exception.CustomerException;
import com.wallet.Repository.Customer_Repo;
import com.wallet.models.Customer;


@Service
public class Customer_service_imple implements CustomerService{

	@Autowired
	Customer_Repo CustomerRepository;
	
	@Override
	public Customer CreateAccount(Customer customer) throws CustomerException {
		return CustomerRepository.save(customer);
	}

	
	@Override
	public Customer UpdateAccount(Customer cusomer, Integer customerID) throws CustomerException {
		Optional<Customer>customers= CustomerRepository.findById(customerID);
		if(customers.isPresent()) {
			return CustomerRepository.save(cusomer);
		}
		throw new CustomerException("Customer not found with ID: "+customerID);
	}

	@Override
	public Customer Delete(Integer customerID) throws CustomerException {
		Customer customer=CustomerRepository.findById(customerID).orElseThrow(()->new CustomerException("Customer not found with ID "+customerID));
		CustomerRepository.delete(customer);
		return customer;
		
	}

	

	
}
