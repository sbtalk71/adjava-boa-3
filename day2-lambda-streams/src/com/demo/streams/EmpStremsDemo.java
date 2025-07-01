package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class EmpStremsDemo {

	public static void main(String[] args) {
		List<Emp> empList=Arrays.asList(
					new Emp(100, "shantanu", "hyderabad", 40000, "male"),
					new Emp(101, "kiran", "bangalore", 56000, "female"),
					new Emp(102, "bala", "chennai", 70000, "male"),
					new Emp(103, "srinivas", "hyderabad", 65000, "male"),
					new Emp(104, "rahul", "bangalore", 50000, "male"),
					new Emp(105, "srilatha", "chennai", 46000, "female"),
					new Emp(106, "meghana", "hyderabad", 86000, "female"),
					new Emp(107, "jolly", "pune", 90000, "male")
				
				);
		
		//List all the employees at Bangalore
		//List all the employees who gets salary > 60000
		//transfer the employees from pune to hyderabad
		//give 10000 increment to all female employees
		//calculate the total salary of all the employees
		//transfer rahul from bangalore to hyderabad by giving 20000 salary hike
		
		

	}

}
