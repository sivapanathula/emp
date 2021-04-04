package com.emp.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionUtility {

	private ConnectionUtility() {

	}

	public static final Connection createConnection() {

		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			String dbURL = "jdbc:sqlite:C://sqlite3/emp.db";
			conn = DriverManager.getConnection(dbURL);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;

	}
}
