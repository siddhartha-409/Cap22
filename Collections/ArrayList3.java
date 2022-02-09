package com.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {	
	
	
	public static void printall(ArrayList<String> al)
	{
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Ravi");		
				
		printall(al);		
		
	}

}
