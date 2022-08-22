package com.jsp.pack1;
abstract class Animal{
	abstract	public void sound() ;
	
	abstract public void movement() ;
		
	
	abstract public void eat() ;
	public void drink() {
		
		System.out.println("Animals require water to drink");
		
	}
	public void design() {
		

	
	System.out.println("*****************************");
}


	class Lion extends Animal{
	public void sound() {
		System.out.println("Roars");
		
	}
	public void Movement() {
		System.out.println("Creaps/crawels");
				
	}
	@Override
	public void eat() {
System.out.println("North indian full meals");

	}
class Snake extends Animal() { 	
	
	@Override
	public void Sound() {
System.out.println();		
	}
	
	}
	



























public class Animal2 {

}
