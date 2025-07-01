package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,12,10,10,21,21,32,43,56,23,45,65,45,89,99);
		
		//List all Even numbers
		numList.stream().filter(num->num%2==0).forEach(System.out::println);
		
		//List all odd numbers
		
		numList.stream().filter(num->num%2!=0).forEach(System.out::println);
		
		//calculate the max and min values
		System.out.println(numList.stream().mapToInt(num->num.intValue()).max().getAsInt());
		System.out.println(numList.stream().mapToInt(num->num.intValue()).min().getAsInt());
		//sort all even numbers in desc order
		numList.stream().filter(num->num%2==0).sorted((n1,n2)->n2.compareTo(n1)).forEach(System.out::println);
		
		//remove duplicates and collect all numbers in another collection
		List<Integer> newNumList= numList.stream().distinct().collect(Collectors.toList());
		System.out.println(newNumList);
		
		
		//find the sum of all numbers > than 30
		int sum=numList.stream().filter(num->num>30).mapToInt(num->num.intValue()).sum();
		System.out.println(sum);
		
		numList.stream().dropWhile(num->num<30).forEach(System.out::println);
		
		
		// add 10 to each number > 45 and display them
		
		numList.stream().filter(num->num>45).mapToInt(num->num.intValue()+10).forEach(System.out::println);
		
		

	}

}
