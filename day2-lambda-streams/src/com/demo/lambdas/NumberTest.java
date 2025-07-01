package com.demo.lambdas;

public class NumberTest {

	
	
	public static void main(String[] args) {
		
		NumberChecker evenNum=(n)->{return n%2==0;};
		
		System.out.println(evenNum.check(7));

	}

}
