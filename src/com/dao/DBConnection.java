package com.dao;

import java.sql.*;


public class DBConnection {
	
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://172.168.1.163:3306/test";
	public static final String HOST = "root";
	public static final String PASSWORD = "Renu_12345";

		public static Connection createConnection() throws Exception {
			System.out.println("Database connection to Test-lokesh.");
			Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, HOST, PASSWORD);
            System.out.println("Database Connection established successfully.");
			return con;
		}
		
		public static void closeConnction(ResultSet rs, PreparedStatement ps, Connection con){		
		    if (rs != null) {
		        try {
		            rs.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (ps != null) {
		        try {
		            ps.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (con != null) {
		        try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}
		    }	
		    System.out.println("Database Connection closed successfully.");
		}        
}
