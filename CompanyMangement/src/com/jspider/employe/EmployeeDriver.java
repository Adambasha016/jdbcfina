package com.jspider.employe;

import java.sql.*;

public class EmployeeDriver {
	// to insert the data
	public void saveEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companymangement1", "root",
					"root");

			Statement stamet = con.createStatement();
			stamet.execute(
					"INSERT INTO employee(id,name,email,password,phone) values (1,'Mohan','Mohan@gmail.com','Mohan950@','9502593449')");
			System.out.println("Employees  ");

			stamet.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// to update the data
	public void updateEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companymangement1", "root",
					"root");

			Statement stamet = con.createStatement();
			stamet.executeLargeUpdate("UPDATE employee SET name ='sai' where id=1");
			System.out.println("employee is update ");

			stamet.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// to delete the data
	public void deleteEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companymangement1", "root","root");
			Statement stamet = con.createStatement();
			stamet.execute("DELETE FROM employee where id=1");
			System.out.println("delete employee id ");
			stamet.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void getEmployee() throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companymangement1", "root","root");
		Statement stamet = con.createStatement();
		ResultSet resultSet = stamet.executeQuery("SELECT * FROM employee");
		while(resultSet.next()) {
			System.out.println("Employee id is :"+resultSet.getInt(1));
			System.out.println("Employee name is :"+resultSet.getString(2));
			System.out.println("Employee email is :"+resultSet.getString(3));
			System.out.println("Employee password is :"+resultSet.getString(4));
			System.out.println("Employee phone is :"+resultSet.getString(5));


		}
		stamet.close();
		con.close();
	}




	public static void main(String[] args)  {

		EmployeeDriver driver = new EmployeeDriver();
		//driver.saveEmployee();
		// driver.updateEmployee();
		//driver.deleteEmployee();
		try {
			driver.getEmployee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
