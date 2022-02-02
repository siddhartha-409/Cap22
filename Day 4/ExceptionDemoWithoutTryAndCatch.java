package com.demo.exceptionhandling;

public class ExceptionDemoWithoutTryAndCatch {
	
	public static void main(String args[]) {
		
		int a =10;
		int b =0;
		
		int temp = a/b;  //this line will get exception [By default JVM will catch exception and terminate the program]
		System.out.println(temp);
		System.out.println("Ended"); //this line will not be printed
		
	}

}
