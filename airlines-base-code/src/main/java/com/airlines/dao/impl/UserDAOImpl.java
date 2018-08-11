package com.airlines.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.airlines.dao.api.UserDAO;
import com.airlines.entities.User;
import com.airlines.model.DBConnect;


public class UserDAOImpl implements UserDAO {
			
	public User saveUser(User user) {
				
		PreparedStatement ps=null;
		try {
			ps=DBConnect.getConnection().prepareStatement("insert into user(fullName,username,email,password,gender,dob,address,contact,roll) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getFullName());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getGender());
			ps.setString(6,user.getDob());
			ps.setString(7,user.getAddress());
			ps.setString(8, user.getContact());
			ps.setString(9, user.getRoll());
			
			ps.execute();
			return (user);
			
		} 
			catch (SQLException e) {
			e.printStackTrace();
			return (user);
		}
		
	}

	public boolean deleteUser(User user) {
			PreparedStatement ps=null;
			try {
				ps=DBConnect.getConnection().prepareStatement("delete from user where uid=?");
				ps.setInt(1, user.getUserId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return true;
	}

	public List<User> getAllUser() {
		
		return null;
	}

	public User getUserByUserName(String userName) {
		
		User user=new User();
		Statement st;
		
		try {
			st = DBConnect.getConnection().createStatement();
			ResultSet rs=st.executeQuery("select * from user where username='"+userName+"'");
			while(rs.next()){
				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("pwd"));
				user.setGender(rs.getString("gender"));
				user.setDob(rs.getString("dob"));
				user.setAddress(rs.getString("address"));
				user.setContact(rs.getString("contact"));
				user.setRoll(rs.getString("roll"));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return user;
		}
		
	}

	public User getUserByEmail(String email) {
		
		User user=new User();
		Statement st;
		
		try {
			st = DBConnect.getConnection().createStatement();
			ResultSet rs=st.executeQuery("select * from user where username='"+email+"'");
			while(rs.next()){
				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("username"));
				user.setFullName(rs.getString("fullname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("pwd"));
				user.setGender(rs.getString("gender"));
				user.setDob(rs.getString("dob"));
				user.setAge(rs.getInt("age"));
				user.setAddress(rs.getString("address"));
				user.setContact(rs.getString("contact"));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			return user;
		}
	}


}
