package com.jsp.pack3;

import java.util.Scanner;

class veg{
	
}
	class Carrot extends veg{
		public void preparehalwa() {
			System.out.println("halwa is Delicious");
			
		}
	}
		class Potato extends Veg {
			
			public void fries () {
				{
					System.out.println("fries is good from helath");
				}
			}

			class Shop{
				public Veg sell (String vn) {
					{
						if(vn.equals("Carrot")) new Carrot();
						if(vn.equals("Potato")) new Potato();
						System.out.println("vn + "is not available");
						return null;
					}
					
				}

public class VegCasting {
public static void main(String[] args) {
	Shop s = new Shop();
	Scanner scn = new Scanner(System.in);
	System.out.println("Vegatable");
	String vn =  scn.next();
	Veg v =  s.sell(vn);
	if(v instanceof Carrot) {
		Carrot c = (Carrot)v;
		((Carrot)v).preparehalwa();}
	if(v instanceof Potato) v;
	p.fries();
}

	}
}
}
