package com.icare.teamg.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class RetrieveData {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ICARE";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    static HashMap<String, ArrayList<String>> data = new HashMap<>();
    public HashMap<String, ArrayList<String>> getData(String db) {
	Connection conn = null;
	Statement stmt = null;
	try {
	    // STEP 2: Register JDBC driver
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    stmt = conn.createStatement();

	    String sql = "SELECT * FROM "+db;
	    ResultSet rs = stmt.executeQuery(sql);
	    // STEP 5: Extract data from result set
	    while (rs.next()) {
		ArrayList<String> temp = new ArrayList<>();
		
		temp.add(rs.getString("username"));
		temp.add(rs.getString("password"));
		temp.add(rs.getString("first"));
		temp.add(rs.getString("last"));
		temp.add(rs.getString("dob"));
		temp.add(Integer.toString(rs.getInt("age")));
		temp.add(rs.getString("address"));
		temp.add(rs.getString("phone"));
		temp.add(rs.getString("email"));
		temp.add(rs.getString("appointment"));
		temp.add(db);
		data.put(rs.getString("username"), temp);
	    }
	    rs.close();
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
	return data; 
    }
}
