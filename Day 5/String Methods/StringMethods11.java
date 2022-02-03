package com.demo.strings;

public class StringMethods11 {

	public static void main(String[] args) {
		
		String s1 = "What now";
		String s2 = "What now";
		String s3 = new String("What now");
		String s4 = s1.intern();
		String s5 = s3.intern();
		String s6 = new String("What now");
		String s7 = new String("What now").intern();
		String s8 = new String("What now").intern();
		
		System.out.println(s1.intern());
		System.out.println(s3.intern());
		System.out.println(s5.intern());
		
		System.out.println();
		
		System.out.println(s1==s2);		
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s1==s5);
		System.out.println(s3==s6);
		System.out.println(s3==s7);
		System.out.println(s7==s8);
		
		
		
		

	}

}
