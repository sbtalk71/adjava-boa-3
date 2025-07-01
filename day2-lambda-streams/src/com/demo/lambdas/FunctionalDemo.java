package com.demo.lambdas;


public class FunctionalDemo {
	

	public static void main(String[] args) {
		
		var name=new String("Shantanu");
		
		System.out.println(name);
		
		GreetService gs = new GreetService();
		
		
		
		GreetMessage greet=new GreetMessage() {
			@Override
			public String getGreet() {
				
				return "Good AfterNoon";
			}
		};
		
		GreetMessage greet2=() ->"Good Evening";  // (method args)->{method body}
		
		
		gs.greet(() ->"Good Evening");
		
		gs.greet(new GoodMorning());
		

	}

}

class GoodMorning implements GreetMessage{
	@Override
	public String getGreet() {
		
		return "Good Morning";
	}
}