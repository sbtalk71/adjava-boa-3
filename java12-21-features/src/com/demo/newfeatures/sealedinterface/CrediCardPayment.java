package com.demo.newfeatures.sealedinterface;

public final class CrediCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using Credit Card");

	}

}
