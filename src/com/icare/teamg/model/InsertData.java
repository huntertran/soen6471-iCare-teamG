package com.icare.teamg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
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

    public void setData(String type, String firstname, String lastname, String dob, String age, String address,
	    String phonenumber, String email, String name, String password) {
	// TODO Auto-generated method stub
	Connection conn = null;
	Statement stmt = null;
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Connecting to a selected database...");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    System.out.println("Connected database successfully...");
	    stmt = conn.createStatement();
	    String sql = "INSERT INTO  " + type + " VALUES (\'" + name + "\', \'" + password + "\', \'" + firstname
		    + "\', \'" + lastname + "\', \'" + dob + "\', " + age + ", \'" + address + "\', \'" + phonenumber
		    + "\', \'" + email + "\', \'\')";
	    System.out.println(sql);
	    stmt.executeUpdate(sql);
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
