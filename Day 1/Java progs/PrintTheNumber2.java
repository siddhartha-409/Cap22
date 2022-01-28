package comdemo;

import java.util.Scanner;

class Printing{
	
	void Prints(){
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int n = num.nextInt();
		
		System.out.println("Number is "+n);		
		
		
	}
}

public class PrintTheNumber2 {
	
	public static void main(String args[]) {
		
		Printing p = new Printing();
	    p.Prints();	
	    
	}

	

}
