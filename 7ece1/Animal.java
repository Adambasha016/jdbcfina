package com.jsp.pack1;

class Animall {
	public void sound()	
	{
		System.out.println("Animal makes sound");

	}


	public void drink()
	{
		System.out.println("Animal need water");
	}
}
class Lion extends Animall{
	public void sound()
	{
		System.out.println("Lion roars");

	}
	public void family() {
		System.out.println("it is carnivous");

	}
}
class Dog extends Animall{
	public void sound()
	{
		System.out.println("Dog barks");
	}
	public void family()
	{
		System.out.println("It is A FIDELITY animal");
	}
}

public class Animal {
	public static void main(String[] args) {
		Animall animal;//refers varible
		animal = new Lion(); //up casting
		animal.drink();//by doing upcasting we only access overriden methods only
		animal.sound();//by doing upcasting we only access overriden methods only
		Lion L = (Lion) animal;// down cast 
		L.family();//to access specific methods  in subclass go for downcasting

		animal = new Dog();//upcasting

		animal .drink();//by doing upcasting we only access overriden methods only
		animal.sound();//by doing upcasting we only access overriden methods only
		Dog d = (Dog) animal;// down cast 
		d.family();//to access specific methods  in subclass go for downcasting





	}
}


