package com.demo.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Enter integer:");			
			Scanner s = new Scanner(System.in);
			String w = s.next();
			s.close();
			int n = Integer.parseInt(w);
			System.out.println(n*n);
			
		}catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}

	}

}
