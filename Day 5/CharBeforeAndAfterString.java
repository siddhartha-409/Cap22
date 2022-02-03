package day5assignments;

import java.util.Scanner;

public class CharBeforeAndAfterString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String s1 = s.next();
		
		System.out.println("Enter String2:");
		String s2= s.next();
		
		s.close();
		
		String t = "";		
		int n;
		int m = 0;
		int l = s2.length();
		
		while(m<s1.length())
		{
			n = s1.indexOf(s2, m);
			if(n>0 && n+l<s1.length()-1)
			{
				t+=String.valueOf(s1.charAt(n-1))+String.valueOf(s1.charAt(n+l));
			}
			
			else if(n>0 && n+l>s1.length()-1)
			{
				t+=s1.charAt(n-1);
			}
			else if(n<=0 && n+l<s1.length()-1)
			{
				t+=s1.charAt(n+l);
			}
			m+=n+l;
		}
		
		System.out.println(t);

	}

}
