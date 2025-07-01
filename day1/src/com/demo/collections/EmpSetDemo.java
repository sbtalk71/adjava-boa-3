package com.demo.collections;

import java.util.HashSet;
import java.util.Set;

import com.demo.exceptions.Emp;

public class EmpSetDemo {

	public static void main(String[] args) {
		Set<Emp> empSet= new HashSet<>();
		//SortedSet<Emp> empSet= new TreeSet<Emp>();
		empSet.add(new Emp(10, "arun"));
		empSet.add(new Emp(14, "ranga"));
		empSet.add(new Emp(11, "dilip"));
		empSet.add(new Emp(12, "kiran"));
		empSet.add(new Emp(13, "naseer"));
		
		
		System.out.println(empSet);
		
		

	}

}
