package com.demo.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling8{
	
	static void quotient(int a,int b) throws InputMismatchException {
		
		int q = a/b;
		System.out.println("Quotient is: "+q);
		
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
				
		try
		{
			System.out.println("Enter num1:");
			int n1 = s.nextInt();
			
			System.out.println("Enter num1:");
			int n2 = s.nextInt();
			quotient(n1,n2);
		}
		catch(Exception e)
		{
			System.out.println("Caught"+e);
		}
		finally{
			
			System.out.println("Inside finally block");
		}
		
		

	}

}
