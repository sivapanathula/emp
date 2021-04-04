package com.emp.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

	private Object result;

	protected final Object execute(Connection conn, String sql, List data) {
		PreparedStatement statement;
		try {
			statement = createStatement(conn, sql);
			setData(statement, data);
			// int result= statement.executeUpdate();
			if (sql.toLowerCase().contains("select")) {
				ResultSet resultSet = executeQuery(statement);
				result = processResultSet(resultSet);
			} else {
				result = executeUpdate(statement);
			}

			closeStatement(statement);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

			return result;
		
		
	}
	private void closeStatement(PreparedStatement statement) throws SQLException {
		statement.close();

	}

	private int executeUpdate(PreparedStatement statement) throws SQLException {

		return statement.executeUpdate();
	}

	protected List<Object> processResultSet(ResultSet resultSet) throws SQLException {

		return null;
	}

	private ResultSet executeQuery(PreparedStatement statement) throws SQLException {

		return statement.executeQuery();
	}

	private final void setData(PreparedStatement statement, List data) throws SQLException {

		for (int i = 0; i < data.size(); i++) {

			if (data.get(i) instanceof Integer) {
				statement.setInt(i + 1, (int) data.get(i));
			}
			if (data.get(i) instanceof String) {
				statement.setString(i + 1, (String) data.get(i));
			}
			
		}
	}

	private PreparedStatement createStatement(Connection conn, String sql) throws SQLException {

		return conn.prepareStatement(sql);
	}

}
