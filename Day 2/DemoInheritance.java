package com.demo.inher;

class Bank{
	
void Deposit() {
		
		System.out.println("deposit");
	}	
	
}


class ICICI extends Bank{
	
	void Deposit() {
		
		super.Deposit();  // it called super class that is bank class
		
		System.out.println("ICICI deposit");
	}
}



class Hdfc extends Bank{
	
	void Deposit() {
		
		System.out.println("Hdfc deposit");
	}
}

public class DemoInheritance {
	
	public static void main(String args[]) {
		
		Bank bank1 = new ICICI();
		bank1.Deposit();
		
		Bank bank2 = new Hdfc();
		bank2.Deposit();
	}

}
