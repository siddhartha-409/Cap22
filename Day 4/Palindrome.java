package day4assignments;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) {
		
		System.out.println("Enter number ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int num = n;
		
		s.close();
		
		int r = 0;
		int rem;
		
		
		while( n != 0 )
        {
            rem = n % 10;
            r= r * 10 + rem;
            n  /= 10;
        }
		
		if (num==r)
			System.out.println(num+" is a Palindrome");
		else
			System.out.println(num+" is not a Palindrome");
	}

}
