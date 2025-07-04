package com.demo.newfeatures.sealedinterface;

public sealed interface Payment permits CrediCardPayment,UpiPayment,NetBankingPayment{

	public void pay(double amount);
}
