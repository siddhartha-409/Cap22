package comdemo;

import java.util.Scanner;

class evorod{
	
	void evod(int n) {
		
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}

public class EvenOrOdd2 {
	
	public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter number : ");		
	    int num=reader.nextInt();
	    
	    evorod e = new evorod();
	    e.evod(num);
	    		
	}

}
