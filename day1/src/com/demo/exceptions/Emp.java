package com.demo.exceptions;

import java.util.Objects;

public class Emp implements Comparable<Emp>{
	private Integer empId;
	private String name;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + empId + " " + name + "]";
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
