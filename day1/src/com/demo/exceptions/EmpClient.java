package com.demo.exceptions;

public class EmpClient {
	private EmpService service;

	public EmpClient(EmpService service) {
		this.service = service;
	}

	public String addEmp(Integer id, String name) {
		return service.addEmp(new Emp(id, name));
	}
}
