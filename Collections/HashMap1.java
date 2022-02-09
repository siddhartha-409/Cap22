package com.demo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Countryyy
{
	HashMap<String, String> M1 = new HashMap<String, String>();
	
	HashMap<String, String> saveCountryCapital(String CountryName, String capital)
	{
		M1.put(CountryName, capital);
		return M1;
	}
	
	String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	
	String getCountry(String capitalName)
	{
		String s = "Not found";
		for(Map.Entry<String, String> i:M1.entrySet()) 
		{
			if(i.getValue()==capitalName)
			{
				s = i.getKey();
				break;
			}
		}
		return s;
	}
	
	HashMap<String, String>  createAnotherMap()
	{
		HashMap<String, String> M2 = new HashMap<String, String>();
		for(Map.Entry<String, String> i:M1.entrySet()) 
		{
			M2.put(i.getValue(), i.getKey());
		}
		return M2;
	}
	
	ArrayList<String> createArrayList()
	{
		ArrayList<String> al = new ArrayList<String>();
		for(Map.Entry<String, String> i:M1.entrySet()) 
		{
			al.add(i.getKey());
		}
		return al;
	}
}

public class HashMap1 {

	public static void main(String[] args) {
		
		Countryyy c = new Countryyy();
		c.saveCountryCapital("India", "Delhi");
		c.saveCountryCapital("USA", "Washington");
		c.saveCountryCapital("UK","London");
		
		System.out.println(c.getCapital("USA"));
		System.out.println(c.getCountry("Delhi"));
		System.out.println(c.createAnotherMap());
		System.out.println(c.createArrayList());		

	}

}
