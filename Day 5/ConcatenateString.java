package day5assignments;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String s1 = s.next().toLowerCase();
		
		System.out.println("Enter String2:");
		String s2= s.next().toLowerCase();
		
		s.close();
		
		if(s1.equals(s2))
			System.out.println(s1);
		else
			System.out.println(s1+s2);		
		

	}

}
