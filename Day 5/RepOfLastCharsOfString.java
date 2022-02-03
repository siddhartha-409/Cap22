package day5assignments;

import java.util.Scanner;

public class RepOfLastCharsOfString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		System.out.println("Enter integer:");
		int n = s.nextInt();
		
		s.close();
		
		String t = "";
		
		for(int i=w.length()-n;i<w.length();i++)
		{
			
			t+=w.charAt(i);		
		
		}				
				
		
		int j = 0;
		
		while(j<n)
		{
			System.out.print(t+"");
			j+=1;
		}
		
		
				
	}

}
