package day5assignments;

import java.util.Scanner;

public class ShortLongShortString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String s1 = s.next();
		
		System.out.println("Enter String2:");
		String s2= s.next();
		
		s.close();
		
		if(s1.length()<s2.length()) {
			
			System.out.println(s1+s2+s1);
		}
		
		else {
			
			System.out.println(s2+s1+s2);			
			
		}

	}

}
