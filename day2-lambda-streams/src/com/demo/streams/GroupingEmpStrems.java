package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEmpStrems {

	public static void main(String[] args) {
		List<Emp> empList = Arrays.asList(new Emp(100, "shantanu", "hyderabad", 40000, "male"),
				new Emp(101, "kiran", "bangalore", 56000, "female"), new Emp(102, "bala", "chennai", 70000, "male"),
				new Emp(103, "srinivas", "hyderabad", 65000, "male"), new Emp(104, "rahul", "bangalore", 50000, "male"),
				new Emp(105, "srilatha", "chennai", 46000, "female"),
				new Emp(106, "meghana", "hyderabad", 86000, "female"), new Emp(107, "jolly", "pune", 90000, "male")

		);

		Map<String, List<Emp>> empGroupByLoc=empList.stream().collect(Collectors.groupingBy(Emp::getLocation));
		
		//System.out.println(empGroupByLoc);
		
		empGroupByLoc.forEach((loc,emps)->System.out.println(loc+"-->"+emps));
		
		Map<String,Long> countByLoc=empList.stream().collect(Collectors.groupingBy(Emp::getLocation,Collectors.counting()));
		
		System.out.println(countByLoc);

	}

}
