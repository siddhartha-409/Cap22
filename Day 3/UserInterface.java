package day3assignments;

import java.util.Scanner;

class Account{
	
	private String accountNumber;	
	private String customerName;
	private double balance;
	
	Account(String a, String c, double b){
		
		accountNumber = a;
		customerName = c;
		balance = b;
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
}


interface MaintenanceCharge{
	
	public float calculateMaintenanceCharge(float noOfYears);	
	
}


class CurrentAccount extends Account implements MaintenanceCharge{
	
	
	
	CurrentAccount(String c, String a, double b){
		
		super(a,c,b);
		
		
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		return (100*noOfYears)+200;
	}
}


class SavingsAccount extends Account implements MaintenanceCharge{
	
	
	
	SavingsAccount(String c, String a, double b){
		
		super(a,c,b);
		
			
		
	}

	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		
		return (50*noOfYears)+50;
	}
	
	
	
}


public class UserInterface {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1. Savings Account \n 2. Current Account");
		System.out.println("Enter your choice:");
		int actype = s.nextInt();
		System.out.println("Enter the Account number: ");
		String a = s.next();
		System.out.println("Enter the Customer Name: ");
		String c = s.next();
		System.out.println("Enter the Balance amount: ");
		double b = s.nextDouble();
		System.out.println("Enter the number of years: ");
		float noOfYears = s.nextFloat();
		s.close();
		
		float m;
		
		Account ac = new Account(a,c,b);		
		SavingsAccount saving = new SavingsAccount(c,a,b);
		CurrentAccount current = new CurrentAccount(c,a,b);
		
		
		if (actype == 1)
			m = saving.calculateMaintenanceCharge(noOfYears);
		else
			m = current.calculateMaintenanceCharge(noOfYears);
		
		
		System.out.println("Customer Name "+ac.getCustomerName());
		System.out.println("Account Number "+ac.getAccountNumber());
		System.out.println("Account Balance "+ac.getBalance());
		System.out.println("Maintenance Charge for Current Account is Rs"+m);		
		
		
	}

}
