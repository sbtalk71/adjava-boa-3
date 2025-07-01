package com.demo.examples;

public class OracleDB implements DbConnection{

	@Override
	public String getConnectionInfo() {
		
		return "Oracle DB Connected";
	}

	@Override
	public String getDbDetails() {
		return "Oracle DB : 14c";
	}

}
