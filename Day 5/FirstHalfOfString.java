package day5assignments;

import java.util.Scanner;

public class FirstHalfOfString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		s.close();
		
		if(w.length()%2!=0)
			System.out.println("Null");
		else
		{
			for(int i=0;i<w.length()/2;i++)
			{
				System.out.print(w.charAt(i)+"");
			}
		}

	}

}
