package com.jsp.pack1;
abstract class A{
	int i;
	public A()
	{
		i=45;


	}
	abstract public void m1(); 

	public static void m2()
	{
		System.out.println("This is a static method");

	}
	public final void m3() {
		System.out.println("This is afinal method");
	}
} 
class B extends A  {
	public void m1() {
		System.out.println("overridden  method m1");

	}                                  

}
class Abstraction{
	public static void main(String[] args ) {
		A a1 = new B();
		System.out.println(a1.i);
		a1.m1();
		a1.m3();
		A.m2();

	}

}