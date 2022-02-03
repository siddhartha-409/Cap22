package com.demo.strings;

public class StringMethods18 {

	public static void main(String[] args) {
		
		String s1 = "It is the only way";
		String s2 = "Itistheonlyway";
		
		String a[] = s1.split("s");
		
		for(String i:a) {
			
			System.out.println(i);
		}
		
		
		String b[] = s1.split("t");
		
		for(String i:b) {
			
			System.out.println(i);
		}
		
		String c[] = s2.split("s");
		
		for(String i:c) {
			
			System.out.println(i);
		}
		
		
		String d[] = s2.split("t");
		
		for(String i:d) {
			
			System.out.println(i);
		}
		
		String e[] = s2.split("t",2);
		
		for(String i:e) {
			
			System.out.println(i);
		}
				
	}

}
