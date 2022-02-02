package day4assignments;

import java.util.Scanner;

public class Menu {
	
	public static void main(String args[]) {
		
		System.out.println("Enter your choice: 1.Add 2.Sub");		
		
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();

		System.out.println("Enter number 1:");
		int n1 = s.nextInt();			
		System.out.println("Enter number 2:");
		int n2 = s.nextInt();
		
		char reply;
		
		if (c==1)
			System.out.println("Result: "+n1+n2);
		else
			System.out.println("Result: "+(n1-n2));
		
		System.out.println("Do you want to continue?");
		
		reply = s.next().charAt(0);
		
		while(reply=='Y' | reply == 'y')
		{
			
			System.out.println("Enter your choice: 1.Add 2.Sub");			
			
			c = s.nextInt();
			
			System.out.println("Enter number 1:");
			n1 = s.nextInt();			
			System.out.println("Enter number 2:");
			n2 = s.nextInt();						
			
						
			if (c==1)
				System.out.println("Result: "+n1+n2);
			else
				System.out.println("Result: "+(n1-n2));
			
			System.out.println("Do you want to continue?");
			
			reply = s.next().charAt(0);
		}
		
		s.close();
		
		
	}

}
