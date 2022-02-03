package com.demo.strings;

public class StringMethods22 {

	public static void main(String[] args) {
		
		String s1 = "Left Felanji";
		String s2= " Left Felanji";
		String s3 = " Left Felanji ";
		
		String s4 = s1.trim();
		String s5 = s2.trim();
		String s6 = s3.trim();
		
		System.out.println(s1.length()+s1.trim()+s4.length());
		System.out.println(s2.length()+s2.trim()+s5.length());
		System.out.println(s3.length()+s3.trim()+s6.length());

	}

}
