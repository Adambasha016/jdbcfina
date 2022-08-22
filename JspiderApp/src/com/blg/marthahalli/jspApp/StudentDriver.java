package com.blg.marthahalli.jspApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDriver {
	public void saveStudent()

	{
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Driver calss is loaded and registerd");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider1", "root", "root");
			System.out.println("estableshed connection with Db server");
			stmt = con.createStatement();
			System.out.println("platform is created");
			stmt.execute("INSERT INTO student2(id,name,marks,clg) value (1,'adam',88,'kuppam engineering college')");
			System.out.println("query is inserted success fully");
			System.out.println("exeution done success fully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void updateStudent()

	{
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" Driver calss is loaded and registerd");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider1", "root", "root");
			System.out.println("estableshed connection with Db server");
			stmt = con.createStatement();
			System.out.println("platform is created");
			stmt.executeUpdate("UPDATE student2 SET name='basha' where id=1 ");
			System.out.println("query is inserted success fully");
			System.out.println("exeution updation");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		StudentDriver stu1 = new StudentDriver();
		// stu1.saveStudent();
		stu1.updateStudent();
	}

}
