package day5assignments;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter String: ");
		
		Scanner s = new Scanner(System.in);
		
		String w = s.next();
		
		s.close();
		
		
		int j = w.length()-1;
		int flag = 0;
		
		for (int i=0;i<(int)w.length()/2;i++) {
			
			if(w.charAt(i)==w.charAt(j))
			{
				j-=1;
			}
				
			else
			{
				flag+=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");		

	}

}
