package com.demo.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("Raj");
		set.add("Ravi");
		set.add("Shyam");
		set.add("Jay");
		set.add("Shyam");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
