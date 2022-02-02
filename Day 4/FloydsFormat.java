package day4assignments;

import java.util.Scanner;

public class FloydsFormat {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a number: ");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		s.close();
		
		for (int i=1;i<=n;i++) {
			
			int j=0;
			
			while (j<i) {
				
				System.out.print("* ");
			    j++;			   
			    
			}
			
			System.out.println(); 
			
		}
		
		
	}

}
