package com.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {	
	

	public static void main(String[] args) {
		
		TreeSet<String> H1 = new TreeSet<>();
		
		H1.add("apple");
		H1.add("orange");
		H1.add("kiwi");
		
		for(String i:H1.descendingSet())
			System.out.println(i);
		
		String s = "kiwi";
		
		for(String j:H1)
		{
			if(j.equalsIgnoreCase(s))
				System.out.println(j);
				break;
		}		
		

	}

}
