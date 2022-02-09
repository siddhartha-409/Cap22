package com.demo.collection;

import java.util.ArrayList;

class Employees
{
	int id;
	String name;
	String address;
	float salary;
	
	Employees(int id, String name, String address, float salary)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
}

public class ArrayList5 {

	public static void main(String[] args) {
		
		ArrayList<Employees> al = new ArrayList<Employees>();
		
		Employees e1 = new Employees(100,"Sid","Hayatnagar,Hyderabad, Telangana",25000);
		Employees e2 = new Employees(98,"Viru","Bangalore, Karnataka",15000);
		
		al.add(e1);
		al.add(e2);
		
		for(Employees e:al)
			System.out.println(e.id+" "+e.name+" "+e.address+" "+e.salary);
		

	}

}
