package com.jsp.pack3;
class StudentInfo{
	int id;
	String name;
	int age;
	public StudentInfo(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public  StudentInfo(int id,String name,StudentInfo s) {
		this.id=id;
		this.name=name;
		this.age=s.age;
	}
	public void display() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);

	}
}
	public class Student{
		public static void main(String[] args) {
			StudentInfo s1 = new StudentInfo(1,"mohan",21);
		    StudentInfo s2 = new StudentInfo(2,"ravi",s1);
			s1. display();
			System.out.println("***********************");
			s2.display();
			System.err.println("Thank you");
		}
	}

