package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class TakeWhileDropWhileDemo {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		
		numList.stream().filter(num->num<4).forEach(System.out::print);
		//output: 123123
		System.out.println();
		
		numList.stream().dropWhile(num->num<4).forEach(System.out::print);
		//output:456789123
		System.out.println();
		
		numList.stream().takeWhile(num->num<4).forEach(System.out::print);
		//output: 123

	}

}
