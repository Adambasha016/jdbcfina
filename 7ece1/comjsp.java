package com.jsp.pack3;

public class comjsp {
	public static void main(String[] args) {
     System.out.println( reverse("java"));
	}
     static String reverse(String arg) {
    	 
	char[] a = arg.toCharArray();
	
	int i = 0,j=a.length-1;
	while(i<j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
		j--;
		
	}
	String s1 = new String(a);
	return s1;
	}
		
	}
	
