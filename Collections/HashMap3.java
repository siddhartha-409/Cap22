package com.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Contactlist
{
	HashMap<String, Integer> M1 = new HashMap<String, Integer>();
	
	HashMap<String, Integer> savecontact(String Name, Integer number)
	{
		M1.put(Name, number);
		return M1;
	}
	
	Integer getnumber(String Name)
	{
		return M1.get(Name);
	}
	
	String getName(Integer Number)
	{
		String s = "Not found";
		for(Map.Entry<String, Integer> i:M1.entrySet()) 
		{
			if(i.getValue()==Number)
			{
				s = i.getKey();
				break;
			}
		}
		return s;
	}	
	
	HashMap<String, Integer> printall()
	{
		/*
		for(Map.Entry<String, Integer> i:M1.entrySet()) 
		{
			System.out.println(i);
		}
		*/
		HashMap<String, Integer> M2 = new HashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> i:M1.entrySet()) 
		{
			M2.put(i.getKey(),i.getValue());
		}
		return M2;
		
	}
	
	
}

public class HashMap3 {

	public static void main(String[] args) {
		
		Contactlist cl = new Contactlist();
		cl.savecontact("Sid",98765);
		cl.savecontact("Dis",43210);
		cl.savecontact("Isd",13457);
		
		
		System.out.println(cl.getName(00000));
		System.out.println(cl.getnumber("Rao"));
		
		System.out.println(cl.printall());

	}

}
