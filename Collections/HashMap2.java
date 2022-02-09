package com.demo.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Australia","Sydney");
		
		Set<Entry<String,String>> set = map.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String,String> m = itr.next();
			if(m.getKey().equals("India")) {
				System.out.println("India present");
				break;
			}
		}
		
		set = map.entrySet();
		itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m = itr.next();
			if(m.getValue().equals("Tokyo")) {
				System.out.println("Tokyo present");
				break;
			}
		}
		
		set = map.entrySet();
		itr= set.iterator();
		
		System.out.println(map.keySet());
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m = itr.next();
			System.out.println(m);
		}

	}

}
