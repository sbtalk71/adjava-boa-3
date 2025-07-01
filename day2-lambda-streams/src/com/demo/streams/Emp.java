package com.demo.streams;

public class Emp {
	private int empId;
	private String name;
	private String location;
	private double salary;
	private String gender;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String name, String location, double salary, String gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.gender = gender;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		
		return "["+empId+" "+name+" "+location+" "+gender+" "+salary+"]";
	}
}
