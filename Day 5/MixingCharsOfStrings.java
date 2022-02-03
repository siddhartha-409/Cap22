package day5assignments;

import java.util.Scanner;

public class MixingCharsOfStrings {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String s1 = s.next();
		
		System.out.println("Enter String2:");
		String s2= s.next();
		
		s.close();
		
		int n1 = s1.length();
		int n2 = s2.length();
		int c = 0;
		
		if(n1<=n2)
		{
			for(int i=0;i<n1;i++)
			{
				System.out.print(String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(i))+"");
				c+=1;
			}
			
			for (int j=c;j<n2;j++)
			{
				System.out.print(s2.charAt(j)+"");
			}
		}
		else
		{
			
			for(int i=0;i<n2;i++)
			{
				System.out.print(String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(i))+"");
				c+=1;
			}
			
			for (int j=c;j<n1;j++)
			{
				System.out.print(s2.charAt(j)+"");
			}
		}
		
	}

}
