package com.demo.newfeatures.sealedinterface;

public non-sealed class NetBankingPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using Net Banking");

	}

}
