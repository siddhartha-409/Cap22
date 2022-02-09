package com.demo.collection;

import java.util.TreeSet;
import java.util.Iterator;

class Countryy {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}


public class TreeSet2 {

	public static void main(String[] args) {
		Countryy countries = new Countryy();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");			
		countries.saveCountryNames("UK");

		System.out.println("India: " + countries.getCountry("India"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}
