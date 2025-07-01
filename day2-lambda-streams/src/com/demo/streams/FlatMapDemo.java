package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(10,20);
		List<Integer> list2=Arrays.asList(30,40);
		List<Integer> list3=Arrays.asList(50,60,70);
		List<Integer> list4=Arrays.asList(80,90,100,110);
		
		List<List<Integer>> nestedList=Arrays.asList(list1,list2,list3,list4);
		
		//nestedList.stream().flatMap(list->list.stream()).peek(System.out::println).count();
		
		System.out.println(nestedList.stream().flatMapToInt(list->list.stream().mapToInt(n->n)).reduce(5,(x,y)->x+y));
		
		

	}

}
