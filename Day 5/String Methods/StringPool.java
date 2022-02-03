package com.demo.strings;

public class StringPool {
	
	public static void main(String args[]) {
		
		String s1 = "Cat";
		String s2 = "Cat";
		
		String s3 = new String("Cat");
		String s4 = new String("Cat");
		
		System.out.println("s1==s2: "+(s1==s2));
		System.out.println("s1==s3: "+(s1==s3));
		System.out.println("s1==s3: "+(s4==s3));
		
		if (s1.equals(s2)) {
			
			System.out.println("Both are equal");
			
		}else {
			
			System.out.println("Both are not equal");
			
		}
		

		if (s1.equals(s3)) {
			
			System.out.println("Both are equal");
			
		}else {
			
			System.out.println("Both are not equal");
			
		}
	}

}
