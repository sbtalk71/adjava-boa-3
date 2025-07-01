package com.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		
		Set<String>fruitsList=new HashSet<String>();
		
		fruitsList.add("apple");
		fruitsList.add("orange");
		fruitsList.add("mango");
		fruitsList.add("pear");
		fruitsList.add("orange");
		System.out.println(fruitsList);
		
		//fruitsList.add(2,"banana");
		
		System.out.println(fruitsList);
		
		fruitsList.remove(4);
		System.out.println(fruitsList);
		
		//fruitsList.add(0,"guava");
		
		
	
		
		System.out.println(fruitsList);
		
		Iterator<String> itr=fruitsList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(":::::::::::::::::::::");
		
		for(String fruit:fruitsList) {
			System.out.println(fruit);
		}
		
		

	}

}
