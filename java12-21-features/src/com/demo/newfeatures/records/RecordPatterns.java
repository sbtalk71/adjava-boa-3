package com.demo.newfeatures.records;

public class RecordPatterns {

	public static void main(String[] args) {
		Object e1= new EmployeeRecord(1, "shantanu", 45000);
		
		if(e1 instanceof EmployeeRecord(int id, String name, double salary)) {
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}

	}

}
