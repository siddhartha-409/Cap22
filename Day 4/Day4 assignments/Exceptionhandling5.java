package com.demo.exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling5 {
	
	void div(int a,int b) throws ArithmeticException
	{
		System.out.println(a/b);
		
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int n1 = s.nextInt();
		
		System.out.println("Enter num1:");
		int n2 = s.nextInt();
		
		s.close();
		
		Exceptionhandling5 d = new Exceptionhandling5();		
		
		
		try {
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Problem with arithmetic operation");
		}
		
		

	}

}
