package day4assignments;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a number: ");		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if (n%2==0)
			System.out.println("Even");
		
		else
			System.out.println("Odd");
		
		s.close();
	}

}
