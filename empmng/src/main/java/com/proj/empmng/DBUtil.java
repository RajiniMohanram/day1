package com.proj.empmng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;

	private static void createConnection() {
		try {
			// 1. Load the driver in JVM
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection
			String url = "jdbc:mysql://localhost:3306/bank";
			String user = "root";
			String psw = "rajini";
			con = DriverManager.getConnection(url, user, psw);
		} catch (SQLException ex) {
			System.out.println("Unable to establish connection");
		} catch (Exception ex) {
			System.out.println("Unable to find driver");
		}
	}

	public static Connection getCon() {
		if (con == null) {
			createConnection();
		}
		return con;
	}

}
