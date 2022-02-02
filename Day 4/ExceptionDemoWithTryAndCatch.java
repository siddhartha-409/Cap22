package com.demo.exceptionhandling;

public class ExceptionDemoWithTryAndCatch {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			
			int temp = a/b;
			System.out.println(temp);
		}
		
		catch(Exception e){
			
			System.out.println("caused due to divide by zero "+e);							
			
		}
		
		System.out.println("Ended");

	}

}
