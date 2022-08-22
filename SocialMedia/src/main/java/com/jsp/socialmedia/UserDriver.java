package com.jsp.socialmedia;

import java.sql.*;

public class UserDriver {
	 
	
	
	
	public void saveUser(User user) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "root");
		PreparedStatement ps = connection.prepareStatement("INSERT INTO USER(id ,name,email,password,mediaType,phonenumber) value(?,?,?,?,?,?)");

		ps.setInt(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getMediaType());
		ps.setString(6, user.getPhonenumber());
		ps.execute();
		System.out.println("user inserted successfully");
		ps.close();
		connection.close();

	}
	
	public void updateUser(User user) throws Exception{
		Connection connection = getTheConnection();
		PreparedStatement ps= connection.prepareStatement("UPDATE USER SET name=?,email=?,password=?,mediaType=?,phonenumber=?,where id=?");
		ps.setString(1, user.getName());
		ps.setString(2,user.getEmail());
		ps.setString(3,user.getPassword());
		ps.setString(4,user.getMediaType());
		ps.setString(5,user.getPhonenumber());
		ps.setInt(6, user.getId());
		ps.executeUpdate();
		ps.close();
		connection.close();
	}
	public void deleteUser(int id) throws Exception {
		Connection connection = getTheConnection();
		PreparedStatement ps = connection.prepareStatement("DELETE FROM User where id =?");
		ps.setInt(1, id);
		ps.execute();
		ps.close();
		connection.close();
	}

	
     public void getAllUser()  throws Exception {
    	 Connection connection = getTheConnection();
    	 PreparedStatement ps = connection.prepareStatement("SELECT ' FROM USER");
    	 
			ResultSet sets = ps.executeQuery();
			while (sets.next()) {
				System.out.println("user id is: "+sets.getInt(1));
				System.out.println("user name is : "+sets.getString(2));
				System.out.println("user email is :"+sets .getString(3));
				System.out.println("user password is :  "+sets .getString(4));
				System.out.println("user media Type is :"+sets.getString(5));
				System.out.println("user phone number is:"+sets.getString(6));
			}
	        ps.close();
			connection.close();
				
				
			}

	private Connection getTheConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "root");
		
		
		return connection ;
	}
}

			
			
			
     

