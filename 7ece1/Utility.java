package com.jsp.pack2;

public class Utility {

	public  long factor(int num) {
		if (num==0 || num==1) return 1;
		return num*factor(num-1);
	}
}
