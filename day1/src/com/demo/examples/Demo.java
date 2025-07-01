package com.demo.examples;

public class Demo {
	
	private String message;
	
	public static int ver=1;
	
	public Demo() {
		
	}
	public Demo(String message) {
		this.message=message;
	}

	public static void main(String[] args) throws Exception{
		Demo d= new Demo();
		//Thread.sleep(Long.MAX_VALUE);
		
		System.out.println(Demo.ver);
		
		System.out.println(DbConnection.getdbType());

	}

}
