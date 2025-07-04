package com.demo.newfeatures.sealedclass;

public final class UpiPayment extends Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using UPI");

	}

}
