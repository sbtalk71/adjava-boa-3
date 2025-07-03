package com.demo.reactive.ex2;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class EmpProcessor extends SubmissionPublisher<String> implements Processor<Emp,String> {

	private Subscription subscription;
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription=subscription;
		subscription.request(1);
		
	}

	@Override
	public void onNext(Emp item) {
		item.setSalary(item.getSalary()+10000);
		System.out.println("Modified salary of "+item.getEmpId()+" to "+item.getSalary());
		submit(item.toString());
		subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println(throwable);
		
	}

	@Override
	public void onComplete() {
		System.out.println("completed");
		
	}

}
