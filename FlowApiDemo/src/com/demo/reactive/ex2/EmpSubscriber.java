package com.demo.reactive.ex2;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class EmpSubscriber implements Subscriber<String> {

	private Subscription subscription;
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		subscription.request(1);
		
	}


	@Override
	public void onNext(String item) {
		System.out.println("Got : "+item);
		subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}

}
