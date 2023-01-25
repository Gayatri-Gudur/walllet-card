package com.wallet.Service;

import com.wallet.Exception.CustomerException;

public interface Customer {

	public Customer CreateAccount(Customer customer) throws CustomerException;
    public Customer UpdateAccount(Customer cusomer, int customerID) throws CustomerException;
    public Customer Delete(Customer customer) throws CustomerException;
	
}
