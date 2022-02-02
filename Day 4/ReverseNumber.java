package day4assignments;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String args[]) {
		
		System.out.println("Enter number ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		s.close();
		
		int r = 0;
		int rem;
		
		while(n>0){
	           
	        rem = n%10;
	        r = (r*10) + rem;
	        n = n/10;
	      }
		
		System.out.println(r);
		
		
	}

}
