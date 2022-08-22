package com.jsp.pack3;

public class Rectangletestclass {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,6);
		Rectangle r2 = new Rectangle(4,7);
		Rectangle r3 = new Rectangle(5,r2);
		Rectangle r4 = new Rectangle(r2,r1);
        Rectangle r5 = new Rectangle(r3,r4);
		r1.area();
		r2.area();
		r3.area();
		r4.area();
		r5.area();
		
	}

}
