package comdemo;

import java.util.Scanner;

public class ASCIIValueOfChar {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter alphabet: ");		
		char s=reader.next().charAt(0);
		
		System.out.println("ASCII value is "+(int)s);
		
	}

}
