package com.demo.newfeatures.sealedclass;

public final class CrediCardPayment extends Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using Credit Card");

	}

}
