package com.jsp.pack3;

import java.util.Scanner;

import com.jsp.pack1.Calc;

public class Calculator {

	public static void main(String[] args) {
		for (;;)
		{

			Scanner scn = new Scanner(System.in);
			System.out.println("num1:");
			int num1 = scn.nextInt();
			System.out.println("num2:");
			int num2 = scn.nextInt();
			System.out.println("+: Addition\n"
					+ "-: Subtraction\n"
					+ "*:multiplication\n"
					+ "/:Division");

			Calc c = new Calc();

			System.out.println("Enter your choice:");
			char choice = scn.next().charAt(0);

			if(choice == '+') {
				long add = c. addition(num1,num2);
				System.out.println(num1+ ""+ choice+""+num2+"="+add);
			}
			else if (choice=='-')
			{
				long sub=c.subtraction(num1, num2);
				System.out.println(num1+ ""+ choice+""+num2+"="+sub);

			}
			else if(choice=='*')
			{
				long mul = c.multiply(num1, num2);
				System.out.println(num1+ ""+ choice+""+num2+"="+mul);

			}
			else if(choice=='/')
			{
				long div = c.division(num1, num2);
				System.out.println(num1+ ""+ choice+""+num2+"="+div);

			}
			else {
				System.out.println("Invalid Input");
			}
			System.out.println("Do you want you continue? y/n");
			char ch = scn.next().charAt(0);

			if (ch=='Y' || ch=='y') continue;
			else
			{
				System.out.println("Thank you from using this Software");
				break;


			}
		}
	}

}
