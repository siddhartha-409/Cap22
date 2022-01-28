package comdemo;

import java.util.Scanner;

class Ascii{	
	
	int As(char z){
		
		return (int)z;
	}

}

public  class AsciiValueOfChar2 {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
		
		System.out.println("Enter alphabet: ");		
		char s=reader.next().charAt(0);
		
		Ascii a = new Ascii();
		
		int res=a.As(s);
		
		System.out.println("Ascii value is "+res);
	}

}
