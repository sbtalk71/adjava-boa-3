package com.demo.reactive.flow;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class ProcessorMain {

	public static void main(String[] args) {
		SubmissionPublisher<Integer> publisher=new SubmissionPublisher<Integer>();
		
		IntegerProcessor processor=new IntegerProcessor();
		MySubscriber sub1= new MySubscriber();
		publisher.subscribe(processor);
		processor.subscribe(sub1);
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(num -> {sleep(500);publisher.submit(num);});
		
		
		

	}
	private static void sleep(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
