package com.demo.inher;

class Animal{
	
	void eat() {
		
		System.out.println("Animal eats");	
		
	}
	
	void sleep() {
		
		System.out.println("Animal sleeps");		
		
	}
	
}
	
class Bird extends Animal{
	
	void eat() {	
		
		System.out.println("Bird eats");		
		
	}
	
	void sleep() {
		
		System.out.println("Bird sleeps");			
		
	}	
	
	void fly() {
		
		System.out.println("Bird flys");	
		
	}
	
}


public class Animals {
	
	public static void main(String args[]) {
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
