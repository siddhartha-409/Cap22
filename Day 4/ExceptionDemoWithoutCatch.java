package com.demo.exceptionhandling;

public class ExceptionDemoWithoutCatch {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			
			int temp = a/b;
			System.out.println(temp);
		}
		
		finally {
			
			System.out.println("from Finally ");
		}
		
		System.out.println("Ended");

	}

}
