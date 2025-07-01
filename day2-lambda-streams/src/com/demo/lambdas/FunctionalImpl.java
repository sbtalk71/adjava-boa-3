package com.demo.lambdas;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalImpl {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven=(n)->n%2==0;
		
		System.out.println(isEven.test(8));
		
		Supplier<String> message=()->"Hello World";
		
		System.out.println(message.get());
		
		// find the square of a number, use the predefined functional interfaces
		Function<Integer, Integer> squareFun=(n)->n*n;
		
		System.out.println(squareFun.apply(6));
		
		// find the sum of two different  numbers, use the predefined functional interfaces
		
		BiFunction<Integer, Integer, Integer> adder=(x,y)->x+y;
		
		System.out.println(adder.apply(3, 6));
		
		IntFunction<Integer> squareNum=(n)->n*n;
		
		System.out.println(squareNum.apply(10));
		
		Consumer<String> printer=(data)->System.out.println(data);
		
		printer.accept("Good Day");
		
		
		var fruits=new ArrayList<String>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pear");
		fruits.add("avocado");
		
		fruits.forEach(fruit->System.out.println(fruit));
		fruits.forEach(System.out::println);
		
		
		DataPrinter dataPrinter=new DataPrinter();
		fruits.forEach(dataPrinter::addHelloAndPrint);

	}

}

class DataPrinter{
	public void addHelloAndPrint(String fruit) {
		String modifiedFruit="hello "+fruit;
		System.out.println(modifiedFruit);
		
	}
}
