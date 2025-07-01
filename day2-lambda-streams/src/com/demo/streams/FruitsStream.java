package com.demo.streams;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FruitsStream {

	public static void main(String[] args) {
		
		Stream<String> fruits=Stream.of("apple","guava","pear","mango","banana");
		
		//fruits.sorted().forEach(System.out::println);
		
		//five letter fruits printed
		
		fruits.filter(fruit->fruit.length()==5).sorted((f1,f2)->f2.compareTo(f1)).forEach(System.out::println);
		
		IntStream range=IntStream.range(10, 100);
		
		range.forEach(System.out::println);

	}

}
