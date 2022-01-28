package comdemo;

import java.util.Scanner;

public class MulOfTwoNums {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter first num:");		
		float n1=reader.nextInt();
				
		System.out.println("Enter first num:");		
		float n2=reader.nextInt();		
				
		float res=n1*n2;	
		
		System.out.println("Result is "+res);
		
	}
}
