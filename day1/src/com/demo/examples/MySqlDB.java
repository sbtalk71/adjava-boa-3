package com.demo.examples;

public class MySqlDB implements DbConnection{

	@Override
	public String getConnectionInfo() {
		
		return "MySql DB Connected";
	}

	@Override
	public String getDbDetails() {
		return "MySQL DB : 8.0.1";
	}

}
