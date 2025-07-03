package com.demo.reactive.ex2;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws Exception{
		SubmissionPublisher<Emp> publisher = new SubmissionPublisher<Emp>();
		
		EmpProcessor processor=new EmpProcessor();
		EmpSubscriber subscriber= new EmpSubscriber();
		
		publisher.subscribe(processor);
		processor.subscribe(subscriber);
		
		Stream.of(new Emp(100,30000),new Emp(101,20000),new Emp(102,40000),new Emp(103,35000))
		.forEach(emp->publisher.submit(emp));
		
		Thread.sleep(3000);
				

	}

}
