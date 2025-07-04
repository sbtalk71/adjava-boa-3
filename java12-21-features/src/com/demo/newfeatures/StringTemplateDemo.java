package com.demo.newfeatures;
import static java.util.FormatProcessor.FMT;

public class StringTemplateDemo {

	public static void main(String[] args) {
		

		String name="shantanu";
		int age=55;
		double salary=80000;
		
		String result1=FMT."name is \{age} and salary is \{salary}";
		System.out.println(result1);
		
		int x = 10;
		int y = 20;
		String result2 = FMT."\{x} + \{y} = \{x + y}";
		System.out.println(result2);
	}

}
