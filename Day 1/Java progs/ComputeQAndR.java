package comdemo;

import java.util.Scanner;

public class ComputeQAndR {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter first num:");		
		int n1=reader.nextInt();
				
		System.out.println("Enter first num:");		
		int n2=reader.nextInt();		
				
		int q = n1/n2;	
		int rem = n1%n2;
		
		System.out.println("Quotient is "+q);
		System.out.print("Remainder is "+rem);
		
		
	}

}
