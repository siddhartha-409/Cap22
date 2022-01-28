package comdemo;

import java.util.Scanner;

public class SwapTwoNums {
	
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter first num:");		
		int n1=reader.nextInt();
				
		System.out.println("Enter first num:");		
		int n2=reader.nextInt();
		
		
		int t=n1;
		n1=n2;
		n2=t;
			
		
		System.out.println("First num is "+(n1));
		System.out.println("Second num is "+n2);
		
	}

}
