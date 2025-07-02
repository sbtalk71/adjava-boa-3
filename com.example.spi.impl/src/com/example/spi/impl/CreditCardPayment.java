package com.example.spi.impl;

import com.example.spi.PaymentService;

public class CreditCardPayment implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount+" Using Credit Card");
		
	}

}
