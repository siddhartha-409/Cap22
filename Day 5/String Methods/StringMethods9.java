package com.demo.strings;

public class StringMethods9 {

	public static void main(String[] args) {
		
		String s1 = "Mein hoon na";
		char[] s2 = new char[20];
		s1.getChars(1, 6, s2, 3);
		
		System.out.println(s2);
		
				
		s2[0]='Y';
		System.out.println(s2);	
		

	}

}
