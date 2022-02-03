package com.demo.strings;

public class StringMethods19 {

	public static void main(String[] args) {
		
		String s = "That is me";
		
		System.out.println(s.startsWith("t"));
		System.out.println(s.startsWith("T"));
		System.out.println(s.startsWith("Th"));
		System.out.println(s.startsWith("t", 3));
	}

}
