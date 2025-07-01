package com.demo.collections;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import com.demo.exceptions.Emp;

public class EmpMapSorted {

	public static void main(String[] args) {
		SortedMap<Integer, Emp> empMap= new TreeMap<Integer, Emp>(new MyComparator());
		
		
		empMap.put(11, new Emp(11, "kiran"));
		empMap.put(10, new Emp(10, "arun"));
		empMap.put(14, new Emp(14, "raju"));
		empMap.put(12, new Emp(12, "ranga"));
		empMap.put(13, new Emp(13, "viswa"));
		
		
		System.out.println(empMap);
		
			

	}

}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}

