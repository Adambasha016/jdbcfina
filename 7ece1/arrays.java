package com.jsp.pack3;

public class arrays {
	public static void main(String[] args) {
		int  [] a = {3,4,8,8,6,4,3,2};
		int s1 = a[0];
		int s2 =a[0];
		int s3 = a[0];
		for(int i=1; i<a.length; i++) {
			if (a[i] == s1) continue;
			if (a[i]< s1 ) {
				s2 = s1;
				s1 = a[i];
				s3 = s2;
			}
			else if(s2==s1 || a[i]<s2) {
				s2 = a[i];
			}
			
		}
		System.out.println(" 3nd smallest num:"+s3);
		}
	}


