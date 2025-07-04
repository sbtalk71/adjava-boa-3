package com.demo.newfeatures.records;

public record EmployeeRecord(int id, String name, double salary) {
	
	public EmployeeRecord(int id, String name, double salary) {
		if(id<1)
		throw new IllegalArgumentException("Id Cannot be less than 1");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

class RecordsTest{
	public static void main(String[] args) {
		EmployeeRecord e1= new EmployeeRecord(1, "shantanu", 45000);
		
		System.out.println(e1);
		System.out.println(e1.name());
	}
}