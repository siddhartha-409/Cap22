package comdemo;

import java.util.Scanner;

class Largest{
	
	int lnm(int n1, int n2, int n3) {
		
		if (n1>n2 & n1>n3) {
			return n1;
			
		}	
		
		else if(n2>n3 & n2>n1) {
			return n2;
		}
		
		else
			return n3;
	}
}

public class LargestNum2 {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
		
		System.out.println("Enter first num:");		
		int n1=reader.nextInt();
				
		System.out.println("Enter second num:");		
		int n2=reader.nextInt();
		
		System.out.println("Enter third num:");		
		int n3=reader.nextInt();
		
		Largest l = new Largest();
		int res = l.lnm(n1,n2,n3);
		
		System.out.println("Largest num is "+res);
	}

}
