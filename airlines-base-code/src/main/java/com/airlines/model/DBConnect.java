package com.airlines.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
public static Connection getConnection(){
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines?useSSL=false" ,"root","root");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return(con);
	
} 
}
