package com.airlines.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.airlines.frames.AdminFrame;
import com.airlines.frames.Frames;
import com.airlines.frames.WelcomeFrame;
import com.airlines.model.DBConnect;

public class LoginServices {

	public void loginServices(String userName, String password){
		Statement st=null;
		try {
			st = DBConnect.getConnection().createStatement();
			ResultSet rs=st.executeQuery("select * from user where username='"+userName+"'");
			if(rs.next()){
				String dbpass=rs.getString("password");
				if(dbpass.equals(password)){
					String dbroll=rs.getString("roll");
					if(dbroll.equals("user")){
					WelcomeFrame.welcomeFrame();
				}
				else{
					AdminFrame.adminFrame();
				}
				}
				
			}
			else{
				Frames.loginError.setText("Invalid Password and User Id");
							}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
