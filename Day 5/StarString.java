package day5assignments;

import java.util.Scanner;

public class StarString {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		s.close();
		
		int star = w.indexOf("*");
		
		for (int i=0;i<w.length();i++)
		{
			if(i==star-1 || i==star || i==star+1)
				continue;
				
			else
				System.out.print(w.charAt(i)+"");
		}
	}

}
