package day4assignments;

import java.util.Scanner;

public class PNZ {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a number: ");		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if (n<0)
			System.out.println("Negative");
		else if (n>0)
			System.out.println("Positive");
		else
			System.out.println("Zero");
		
		s.close();
	}

}
