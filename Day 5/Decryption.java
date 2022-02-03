package day5assignments;

import java.util.Scanner;

public class Decryption {
	
	public static void main(String args[]) {
		
		System.out.println("Enter secret message:");
		
		Scanner s = new Scanner(System.in);
		
		String e = s.next();
		
		System.out.println(e);
		
		s.close();
		
		String d = "";
		
		for (int i=0;i<e.length();i++) {
			
			if(Character.isAlphabetic((e.charAt(i)))) {
				
				d+= (char) ((int)e.charAt(i)-7);
			}
			
			else if(e.charAt(i)==' ') {
				
				d+=e.charAt(i);
			}
			
			
		}
		
		if(d.length()>0)
			System.out.println("Decrypted text: "+d);
		else
			System.out.println("No Hidden Message");
			
	}

}
