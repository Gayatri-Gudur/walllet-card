package com.wallet.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Account_Handler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer acId;
	
	@OneToOne(mappedBy = "ac",cascade = CascadeType.ALL)
	private Customer customer;
	private Integer Balance;
	
	
	
}
