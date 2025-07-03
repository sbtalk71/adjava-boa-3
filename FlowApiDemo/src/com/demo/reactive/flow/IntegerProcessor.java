package com.demo.reactive.flow;


import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class IntegerProcessor extends SubmissionPublisher<Integer> implements Processor<Integer, Integer>{

	private Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		subscription.request(1);
		
	}

	@Override
	public void onNext(Integer item) {
		Integer newValue=item+10;
		System.out.println("Modified "+item+" to "+newValue);
		submit(newValue);
		subscription.request(1);
		
		
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println(throwable);
		
	}

	@Override
	public void onComplete() {
		System.out.println("completed..");
		
	}

}
