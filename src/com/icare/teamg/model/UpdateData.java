package com.icare.teamg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    boolean flag = false;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ICARE";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public boolean isFlag() {
	return flag;
    }

    public void setFlag(boolean flag) {
	this.flag = flag;
    }

    public void updateData(String type, String firstname, String lastname, String dob, String age, String address,
	    String phonenumber, String name) {
	// TODO Auto-generated method stub
	Connection conn = null;
	PreparedStatement stmt = null;
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Connecting to a selected database...");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    System.out.println("Connected database successfully...");
	    String sql = "update " + type
		    + " set first = ? , last = ?, dob = ?, age = ?, address =?, phone = ? where username = ? ";
	    stmt = conn.prepareStatement(sql);
	    stmt.setString(1, firstname);
	    stmt.setString(2, lastname);
	    stmt.setString(3, dob);
	    stmt.setInt(4, Integer.parseInt(age.trim()));
	    stmt.setString(5, address);
	    stmt.setString(6, phonenumber);
	    stmt.setString(7, name);
	    System.out.println("Here" + sql);
	    stmt.executeUpdate();
	} catch (SQLException se) {
	    se.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		if (stmt != null)
		    conn.close();
	    } catch (SQLException se) {
	    }
	    try {
		if (conn != null)
		    conn.close();
	    } catch (SQLException se) {
		se.printStackTrace();
	    }
	}
	setFlag(true);
    }
}
