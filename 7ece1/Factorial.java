package com.jsp.pack1;

import java.util.Scanner;

import com.jsp.pack2.Utility;

public class Factorial {
	
	private static Calc calc;

	public static void main(String[] args) {
		Scanner mohan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = mohan.nextInt();
	     Utility utility = new Utility();
		long result = utility.factor(num);
		System.out.println(result);
		
	}

}
