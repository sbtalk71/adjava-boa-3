package com.example.service.demo;

import java.util.ServiceLoader;

import com.example.spi.PaymentService;

public class Main {

	public static void main(String[] args) {
		ServiceLoader<PaymentService> services=ServiceLoader.load(PaymentService.class);
		for(PaymentService paymentService:services) {
			paymentService.pay(20000);
		}

	}

}
