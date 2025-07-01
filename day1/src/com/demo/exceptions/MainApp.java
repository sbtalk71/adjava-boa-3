package com.demo.exceptions;

import java.io.IOException;

public class MainApp {

	public static void main(String[] args)  {
		
		EmpRepository repo= new EmpRepository();
		EmpService service= new EmpService(repo);
		EmpClient client=new EmpClient(service);
		try {
		client.addEmp(0, "Shantanu");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch( RuntimeException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("End of Main method");

	}

}
