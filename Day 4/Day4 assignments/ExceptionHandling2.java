package com.demo.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Enter size of array:");			
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter element:");
			a[i]=(s.nextInt());
			
		}
		
		try
		{
			System.out.println("Enter index:");
			int index = s.nextInt();
			System.out.println(a[index]);
			System.out.println("The array element successfully accessed");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
			
		
		
	}

}
