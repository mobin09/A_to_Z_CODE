package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class DButils {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private  static String username = "root";
    private  static String pass = "Mobink09@86";
    
    public  static Connection getConnection() {
    	
    	Connection con = null;
    	try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_engineer", username, pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    	return con;
    }
    
    
}
