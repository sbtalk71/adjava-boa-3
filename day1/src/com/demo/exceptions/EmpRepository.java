package com.demo.exceptions;

public class EmpRepository {

	public String save(Emp emp) {
		String message="";
		try {
			if(emp.getEmpId()<1) {
				throw new DataAccessException("id not allowed");
			}else {
				message= "Emp Saved";
			}
		}catch (DataAccessException e) {
			throw new RuntimeException(e);
		}
		return message;
	}
}
