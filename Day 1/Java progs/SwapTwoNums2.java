package comdemo;

import java.util.Scanner;

class Swapping{
	
	void swap(int n1,int n2) {
		
		int t=n1;
		n1=n2;
		n2=t;
		
		System.out.println("Num1 is "+n1);
		System.out.println("Num2 is "+n2);
	}
}

public class SwapTwoNums2 {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
				
		System.out.println("Enter first num:");		
		int n1=reader.nextInt();
				
		System.out.println("Enter second num:");		
		int n2=reader.nextInt();
		
		Swapping s = new Swapping();
		
		s.swap(n1, n2);
		
		
	}

}
