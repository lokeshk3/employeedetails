package com.service;

import java.sql.*;
import java.util.Date;
import com.bean.Employee;
import com.dao.DBConnection;

public class EmployeeOperations {
	
	public static boolean insertEmployee(int id, String name, Date dob, Date doj, String designation) throws Exception{
		
    		Connection con = DBConnection.createConnection();
    		PreparedStatement ps = con.prepareStatement("INSERT INTO test.employee VALUES(?,?,?,?,?)");  
    		ps.setInt(1, id);
    		ps.setString(2, name);
    		ps.setDate(3, new java.sql.Date(dob.getTime()));
    		ps.setDate(4, new java.sql.Date(doj.getTime()));	
    		ps.setString(5, designation);

    		ResultSet rs = null;
            int i = ps.executeUpdate(); 
            System.out.println(i +" records inserted successfully.");
            DBConnection.closeConnction(rs, ps, con);
            return true;
    }
	
	public static Employee getEmployee(int id) throws Exception {
		
			Connection con = DBConnection.createConnection();
    		PreparedStatement ps = con.prepareStatement("SELECT * FROM test.employee WHERE id = ?"); 
    		ps.setInt(1, id);
    		ResultSet rs = ps.executeQuery();
    		Employee emp = new Employee();
    		while(rs.next()) {
	    		emp.setId(rs.getInt(1));
	    		emp.setName(rs.getString(2));
	    		emp.setDob(rs.getDate(3));
	    		emp.setDoj(rs.getDate(4));
	    		emp.setDesignation(rs.getString(5));
    		}
            DBConnection.closeConnction(rs, ps, con);
    		return emp;
	}
}
