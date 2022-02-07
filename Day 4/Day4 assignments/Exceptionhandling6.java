package com.demo.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyRange extends Exception{
	
	MyRange(String msg){
		
		super(msg);
	}
}




public class Exceptionhandling6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		
		
		try
		{
			System.out.println("Enter name:");
			String name1 = s.next();			
			
			System.out.println("Enter marks1:");
			int marks1 = s.nextInt();
			
			if(marks1>100 || marks1<0)
				throw new MyRange("Enter values in range 0-100");
						
			System.out.println("Enter marks2:");
			int marks2 = s.nextInt();
			
			if(marks2>100 || marks2<0)
				throw new MyRange("Enter values in range 0-100");
						
			System.out.println("Enter marks3:");
			int marks3 = s.nextInt();
			
			if(marks3>100 || marks3<0)
				throw new MyRange("Enter values in range 0-100");
			
			float avg = (marks1+marks2+marks3)/3;
			
			System.out.println("Average is:"+avg);
			
			
			s.close();
			
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Enter valid number");
		}
		catch(MyRange e)
		{
			System.out.println(e);
		}
		
				

	}

}
