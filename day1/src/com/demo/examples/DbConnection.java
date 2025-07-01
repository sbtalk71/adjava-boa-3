package com.demo.examples;

public interface DbConnection {

	String releaseVersion="1.0";
	
	String getConnectionInfo();
	String getDbDetails();
	default String getBufferSize() {
		return myPrivateMethod();
	};
	
	
	static String getdbType() {
		return "RDBMS";
	}
	
	private String myPrivateMethod() {
		return "this is a private method";
	}
}
