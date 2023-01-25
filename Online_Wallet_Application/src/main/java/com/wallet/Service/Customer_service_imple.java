package com.wallet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.Exception.CustomerException;
import com.wallet.Repository.Customer_Repo;

@Service
public class Customer_service_imple implements Customer {

	@Autowired
	Customer_Repo customerRepository;
	@Override
	public Customer CreateAccount(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer UpdateAccount(Customer cusomer, int customerID) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer Delete(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
