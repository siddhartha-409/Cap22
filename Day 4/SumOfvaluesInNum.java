package day4assignments;

import java.util.Scanner;

public class SumOfvaluesInNum {
	
	public static void main(String args[]) {
		
		System.out.println("Enter number: ");		
		Scanner s = new Scanner(System.in);
		String n = s.next();
		s.close();
		
		int sum = 0;
		
		for (int i=0;i<n.length();i++) {
			
			sum+=(int)n.charAt(i)-48;	
			
		}
		
		System.out.println(sum);
	}

}
