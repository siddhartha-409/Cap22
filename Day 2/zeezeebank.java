package day2.assignments;

import java.util.Scanner;

class zzb{
	
	double amt =0;
	
	double bal(double i) {
		
		amt+=i;
		return amt;
		
	}	
	
	
	double deposit(double n) {
		
		amt+=n;		
		return amt; 
		
	}
	
	double withdraw(double n) {
		
		if (amt<n)
			return -1;
		
		amt-=n;
		return amt;
	}
}

public class zeezeebank {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account number:");
		long a= s.nextInt();
		
		zzb z = new zzb();
		
		System.out.println("Enter initial balance:");
		long b = s.nextInt();
		z.bal(b);		
		
		System.out.println("Enter amount to deposit:");
		double d = s.nextInt();
		double e = z.deposit(d);
		System.out.println("Available balance is: "+e);
		
		System.out.println("Enter amount to withdraw:");
		double w = s.nextInt();
		double x = z.withdraw(w);
		if(x>=0)
			System.out.println("Available balnce is :"+x);
		else
			System.out.println("Insufficient balance");
	}

}
