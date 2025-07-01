package com.demo.examples;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Optional<DbConnection> opt = DbFactroy.getDB("mysqls");
		
		if(opt.isPresent()) {
		System.out.println(opt.get().getConnectionInfo());
		System.out.println(opt.get().getDbDetails());
		}else {
			System.out.println("The DB Type is undefined..");
		}

	}

}
