package com.demo.reactive.ex2;

import java.util.Objects;

public class Emp implements Comparable<Emp> {
	private Integer empId;
	private double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer empId, double salary) {
		super();
		this.empId = empId;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "[" + empId + " " + salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(empId, other.empId);
	}

	@Override
	public int compareTo(Emp o) { // TODO Auto-generated method stub
		return this.empId - o.getEmpId();
	}

}
