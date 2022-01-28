package comdemo;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter alphabet: ");		
		char s=reader.next().charAt(0);
				
				
		if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
			
			System.out.println("Vowel");
		}
		
		else{
			
			System.out.println("Consonant");
		}	
		
	}

}
