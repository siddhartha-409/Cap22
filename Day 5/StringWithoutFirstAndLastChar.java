package day5assignments;

import java.util.Scanner;

public class StringWithoutFirstAndLastChar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		s.close();
		
		if(w.length()<2)
			System.out.println("");
		else
		{
			for(int i=1;i<w.length()-1;i++)
			{
				System.out.print(w.charAt(i)+"");
			}
		}

	}

}
