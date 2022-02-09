package com.demo.collection;

import java.util.ArrayList;
import java.util.Vector;

class Employeess
{
	int id;
	String name;
	String address;
	float salary;
	
	Employeess(int id, String name, String address, float salary)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}

public class Vector2 {
	
	public static void main(String[] args) {
		
		Vector<Employeess> v = new Vector<Employeess>();
		
		Employeess e1 = new Employeess(100,"Sid","Hayatnagar,Hyderabad, Telangana",25000);
		Employeess e2 = new Employeess(98,"Viru","Bangalore, Karnataka",15000);
		
		v.add(e1);
		v.add(e2);
		
		for(Employeess e:v)
			System.out.println(e.id+" "+e.name+" "+e.address+" "+e.salary);
		

	}	
	

}
