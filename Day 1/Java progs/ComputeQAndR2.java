package comdemo;

import java.util.Scanner;

class compute{
	
	void comp(int n1,int n2) {
		
		int q=n1/n2;
		int r=n1%n2;
		
		System.out.println("Quotient is "+q);
		System.out.println("Remainder is "+r);
		
	}
}

public class ComputeQAndR2 {
	
	public static void main(String args[]) {
		
		Scanner	reader = new Scanner(System.in);
	
	    System.out.println("Enter first num : ");		
	    int n1=reader.nextInt();
	    
	    System.out.println("Enter second num : ");		
	    int n2=reader.nextInt();
	    
	    compute c = new compute();
	    
	    c.comp(n1,n2);
	    
	}	    

}
