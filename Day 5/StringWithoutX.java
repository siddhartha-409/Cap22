package day5assignments;

import java.util.Scanner;

public class StringWithoutX {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		s.close();
		
		String t = "";
		
		if(w.charAt(0)!='x')
			t+=w.charAt(0);
		
		for(int i=1;i<w.length()-1;i++)
		{
			t+=w.charAt(i);
			
		}
		
		if(w.charAt(w.length()-1)!='x')
			t+=w.charAt(0);
		System.out.println(t);

	}

}
