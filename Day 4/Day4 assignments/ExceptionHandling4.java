package com.demo.exceptionhandling;

import java.util.InputMismatchException;

public class ExceptionHandling4 {
	
	public static int sum(int num, String args[])  throws ArithmeticException, NumberFormatException
	{
		
		int a[] = new int[num];
		
		int sum = 0;
		
		for (int i = 0; i < num; i++)
			a[i] = Integer.parseInt(args[i]);		    
		
		for (int i = 0; i < num; i++)
			sum += a[i];
		return sum;
		
	}

	public static void main(String args[]) {
		
		
		String b[] = new String[args.length];
		for (int i = 0; i < args.length; i++)
			b[i] = (args[i]);
		
		
		double avg = 0;
		try {
			int n =args.length;
			int sum1 = sum(n,b);
			
			avg = sum1 / n;
			
			System.out.println("sum: " + sum1);
			System.out.println("avg: " + avg);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		

	}

}
