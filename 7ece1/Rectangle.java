package com.jsp.pack3;
 
public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;

	}
	public Rectangle(int length,Rectangle r)
	{
		this.length = length;
		this.breadth = r.breadth;

	}
	public Rectangle(Rectangle x,Rectangle y)
	{
		this.length = x.length;
		this.breadth = y.breadth;
	}
	public void area()
	{
		System.out.println(length*breadth);
	}



}


