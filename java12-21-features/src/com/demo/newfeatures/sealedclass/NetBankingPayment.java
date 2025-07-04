package com.demo.newfeatures.sealedclass;

public non-sealed class NetBankingPayment extends Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using Net Banking");

	}

}
