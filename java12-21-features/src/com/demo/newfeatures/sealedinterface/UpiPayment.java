package com.demo.newfeatures.sealedinterface;

public final class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using UPI");

	}

}
