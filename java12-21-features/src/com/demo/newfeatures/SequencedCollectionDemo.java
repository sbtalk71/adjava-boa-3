package com.demo.newfeatures;

import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {

	public static void main(String[] args) {
		SequencedCollection<String> fruits=new LinkedList<String>();
		
		fruits.add("apple");
		fruits.add("guava");
		fruits.add("avocado");
		fruits.add("mango");
		
		System.out.println("First Element :"+fruits.getFirst());
		System.out.println("Last Element :"+fruits.getLast());
		
		
		SequencedCollection<String> fruits2=fruits.reversed();
		
		System.out.println(fruits2);
		

	}

}
