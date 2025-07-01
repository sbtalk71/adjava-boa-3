package com.demo.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class SetDemo {

	public static void main(String[] args) {
		
		//List<String> fruitsList=new ArrayList<String>();
		//List<String> fruitsList=new LinkedList<String>();
		Queue<String> fruitsList=new LinkedList<String>();
		
		fruitsList.add("apple");
		fruitsList.add("orange");
		fruitsList.add("mango");
		fruitsList.add("pear");
		
		System.out.println(fruitsList);
		
		//fruitsList.add(2,"banana");
		
		System.out.println(fruitsList);
		
		fruitsList.remove(4);
		System.out.println(fruitsList);
		
		//fruitsList.add(0,"guava");
		fruitsList.offer("Guava");
		
	
		
		System.out.println(fruitsList);
		
		Iterator<String> itr=fruitsList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(":::::::::::::::::::::");
		
		for(String fruit:fruitsList) {
			System.out.println(fruit);
		}
		
		/*
		 * ListIterator<String> listItr=fruitsList.listIterator();
		 * 
		 * while(listItr.hasNext()) { System.out.println(listItr.next()); }
		 * 
		 * while(listItr.hasPrevious()) { System.out.println(listItr.previous()); }
		 */

	}

}
