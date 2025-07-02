package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> namesList=Arrays.asList("shantanu","kiran","pavan","srilatha","meghana","srinivas","ravi","ranga");
		
		//display the names with length >6 chars
		
		namesList.stream().filter(name->name.length()>6).forEach(System.out::println);
		
		//calculate the sum of length of names <8 chars long
		int sum=namesList.stream().filter(name->name.length()<8).mapToInt(name->name.length()).sum();
		
		//collect all the names in a List with names starts with 's'
		
		List<String> names= namesList.stream().filter(name->name.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(namesList.stream().skip(1).findFirst().get());

	}

}
