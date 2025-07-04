package com.demo.newfeatures;

import java.util.Arrays;

public class ArrayParallelSort {

	public static void main(String[] args) {
		Integer[] numbers= {10,19,23,2,8,4,3,5,6};
		
		Arrays.parallelSort(numbers, (n1,n2)->n2.intValue()-n1.intValue());
		
		System.out.println(Arrays.toString(numbers));
		

	}

}
