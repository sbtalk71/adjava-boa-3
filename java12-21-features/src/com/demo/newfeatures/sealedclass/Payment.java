package com.demo.newfeatures.sealedclass;

public sealed abstract class Payment permits CrediCardPayment,UpiPayment,NetBankingPayment{

	public abstract void pay(double amount);
}
