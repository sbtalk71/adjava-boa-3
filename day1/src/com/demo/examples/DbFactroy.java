package com.demo.examples;

import java.util.Optional;

public class DbFactroy {

	public static Optional<DbConnection> getDB(String dbType) {
		if(dbType.equals("oracle")) {
			return Optional.of(new OracleDB());
		}else if(dbType.equals("mysql")) {
			return Optional.of(new MySqlDB());
		}else {
			return Optional.empty();
		}
	}
}
