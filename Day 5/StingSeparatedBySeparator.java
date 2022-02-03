package day5assignments;

import java.util.Scanner;

public class StingSeparatedBySeparator {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String w = s.next();
		
		System.out.println("Enter String:");
		String x = s.next();
		
		System.out.println("Enter occurences:");
		int n = s.nextInt();
		
		for (int i=0;i<n-1;i++)
		{
			System.out.print(w+x+"");
		}
		System.out.print(w+"");
		
	}

}
