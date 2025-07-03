package com.demo.reactive.flow;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class MainApp1 {

	public static void main(String[] args) {
		SubmissionPublisher<Integer> publisher = new SubmissionPublisher<Integer>();
		MySubscriber sub1 = new MySubscriber();
		MySubscriber sub2 = new MySubscriber();

		publisher.subscribe(sub1);
		publisher.subscribe(sub2);

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(num -> {sleep(500);publisher.submit(num);});
	

		
		System.out.println("bye bye..");
	}

	private static void sleep(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
