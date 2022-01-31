package com.demo.inher;

public class TestEmployee {
	
	public static void main(String args[]) {
		
		Persons p =new Persons("Virat");
		Employees  e = new Employees("Kohli",34);
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(p.name);
		System.out.println(e);
	}

}
