package com.demo.iostreams;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String line=sc.next();
			if(line.equals("exit")) break;
			System.out.println(line);
			
		}

	}

}
