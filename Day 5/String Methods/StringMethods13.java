package com.demo.strings;

public class StringMethods13 {

	public static void main(String[] args) {
		
		String s1 = "Python Lang";
		String s2 = "Java Prog";
		
		System.out.println(s1.join(",", s2));
		
		System.out.println(s1.join(",", s1,s2));
		
		String s3 = String.join("--", "hi","there","bye");
		
		System.out.println(s3);

	}

}
