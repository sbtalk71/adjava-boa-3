package com.demo.exceptions;

public class EmpService {

	private EmpRepository repo;

	public EmpService(EmpRepository repo) {
		this.repo = repo;
	}

	public String addEmp(Emp e) {
		String message = "";
		try {
			message = repo.save(e);
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
			throw ex;
		}
		return message;
	}
}
