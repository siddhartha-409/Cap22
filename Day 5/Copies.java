package day5assignments;

import java.util.Scanner;

public class Copies {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		s.close();
		
		if(w.length()==0)
			System.out.println("");
		
		else if (w.length()<2) {
			char c1 = w.charAt(0);
			String t = "";
			for (int i=0;i<w.length();i++) {
				t+=c1;
			}
			System.out.println(t);
		}
		
		else {
			
			char c1 = w.charAt(0);
			char c2 = w.charAt(1);
			
			String x = String.valueOf(c1)+String.valueOf(c2);
		
			String t = "";
			for (int i=0;i<w.length();i++) {
				t+=x;
			}
			System.out.println(t);
			
		}

	}

}
