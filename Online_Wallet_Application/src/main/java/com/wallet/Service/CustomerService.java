package com.wallet.Service;

import com.wallet.Exception.CustomerException;
import com.wallet.models.Customer;

public interface CustomerService {

	public Customer CreateAccount(Customer customer) throws CustomerException;
    public Customer UpdateAccount(Customer cusomer, Integer customerID) throws CustomerException;
    public Customer Delete(Integer customerID) throws CustomerException;
	
	
}
