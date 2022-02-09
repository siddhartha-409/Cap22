package com.demo.collection;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap {
	private TreeMap<String, String> M1;
	
	public CountryMap() {
		M1 = new TreeMap<String, String>();
	}
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			if (m.getValue().equals(capitalName))
				return m.getKey();
		}
		
		return null;
	}
	
	public TreeMap<String, String> swap() {
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			M2.put(m.getValue(), m.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			list.add(m.getKey());
		}
		
		return list;
	}
}
public class TreeMap1 {
	public static void main(String[] args) {
		CountryMap countryMap = new CountryMap();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("USA", "Washington D.C.");
		countryMap.saveCountryCapital("Japan", "Tokyo");		
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		System.out.println(countryMap.toArrayList());
		
		TreeMap<String, String> M2 = countryMap.swap();
		System.out.println(M2);
	}
}
