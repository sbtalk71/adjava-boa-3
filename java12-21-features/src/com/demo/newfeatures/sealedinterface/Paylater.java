package com.demo.newfeatures.sealedinterface;

public class Paylater /*implements Payment */{

	//@Override
	public void pay(double amount) {
		System.out.println("Paid INR "+amount +" Using Pay Later");

	}

}
