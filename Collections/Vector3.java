package com.demo.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employe
{
	int id;
	String name;
	String address;
	float salary;
	
	Employe(int id, String name, String address, float salary)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}

public class Vector3 {

	public static void main(String[] args) {
		
		Vector<Employe> vector = new Vector<>();
		 
		Employe e1 = new Employe(100,"Sid","Hayatnagar,Hyderabad, Telangana",25000);
		Employe e2 = new Employe(98,"Viru","Bangalore, Karnataka",15000);
		
        vector.add(e1);
        vector.add(e2);         
        
        for(Employe e:vector)
			System.out.println(e.id+" "+e.name+" "+e.address+" "+e.salary);
        
        System.out.println("The elements of the Vector is : " + vector);
 
        
        Iterator<Employe> it = vector.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		
		
		 // Create Enumeration
        Enumeration en = vector.elements();
 
        // hasMoreElements() is used to check whether there
        // are more element to be enumerated
        while (en.hasMoreElements()) {
 
            // nextElement() is used to return the next
            // object in enumeration
            System.out.println(en.nextElement());
        }
        

	}

}
