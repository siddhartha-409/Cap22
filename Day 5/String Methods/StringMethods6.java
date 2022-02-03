package com.demo.strings;

public class StringMethods6 {

	public static void main(String[] args) {
		
		String s1 = "RamJi";
		String s2 = "ramji";
		String s3 = "ram ji";
		String s4 = new String("ramji");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
