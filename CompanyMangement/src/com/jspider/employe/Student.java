package com.jspider.employe;

import java.sql.*;

public class Student {

	public void saveStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student1", "root", "root");
			Statement stamet = con.createStatement();
			stamet.execute("INSERT INTO student2(id,name,registrationnumber,rollnumber,phone) value (1,'sudharshan','17fa120@','29','950248348')");
			System.out.println("Student1 data isInserted");
			stamet.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student1", "root", "root");
			Statement stamet = con.createStatement();
			stamet.executeLargeUpdate("UPDATE Student2 SET name='mohan' where id=1");
			System.out.println("Student data is update");
			stamet.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void deletestudent()  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student1", "root", "root");
			Statement stamet = con.createStatement();
			stamet.execute("DELETE  FROM Student2 where id=1");
			System.out.println("Student data is deleted");
			stamet.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		Student driver = new Student();
		//driver.saveStudent();
		//driver.updateStudent();
		driver.deletestudent();
		}
}

