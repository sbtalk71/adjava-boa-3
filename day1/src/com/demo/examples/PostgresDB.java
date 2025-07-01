package com.demo.examples;

public class PostgresDB implements DbConnection{

	@Override
	public String getConnectionInfo() {
		
		return "Postgres DB Connected";
	}

	@Override
	public String getDbDetails() {
		return "Postgres DB : 16";
	}

	@Override
	public String getBufferSize() {
		return "10MB";
	}
}
