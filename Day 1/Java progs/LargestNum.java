package comdemo;

import java.util.Scanner;

public class LargestNum {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter first num:");		
		int n1=reader.nextInt();
				
		System.out.println("Enter first num:");		
		int n2=reader.nextInt();
		
		System.out.println("Enter first num:");		
		int n3=reader.nextInt();	
				
		if (n1>n2 & n1>n3) {
			System.out.println("Largest num is "+n1);
			
		}	
		
		else if(n2>n3 & n2>n1) {
			System.out.println("Largest num is "+n2);
		}
		
		else
			System.out.println("Largest num is "+n3);
		
		
	}
				

}
