package com.demo.inher;

public class Employees extends Persons{
	
	int age;
	Employees(String n, int a){
		
		super(n);
		this.age=a;
		
		
		}
	
	int getage() {
		return age;
	}
	
	public String toString() {
		
		return "Name is "+name+", age is "+age;
		
		
	}

}
