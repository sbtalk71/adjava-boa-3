package com.demo.iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KbInputDemo {

	public static void main(String[] args) {
		try(InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			){
			
			String line="";
			System.out.println("Enter 'exit' to close..");
			while(!line.equals("exit")){
				line=br.readLine();
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
