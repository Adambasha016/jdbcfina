package com.jsp.pack1;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Name:"+ name);
		System.out.println("ID:"+ id);
		System.out.println("Age:"+ age );
	}
		
	}
public class FirstCode {

public static void main(String[] args)
{
	Student s1 = new Student(1, "mohan",18);
	Student s2 = new Student(2,"sai", 19);
	s1.display();
//	System.out.println("****************")
	s2.display();
}
}