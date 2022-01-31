package day2.assignments;

import java.util.Scanner;

class Patient{	
	
	String name;
	double w;
	double h;		
	
	
	public Patient(String name2, double w2, double h2) {
		
		name = name2;
		w=w2;
		h=h2;		
		
		
	}	
	
	double bmi(double w,double h) {
		
		return (w/(h*h))*703;
	}
	
}

public class Patients {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = s.next();
		System.out.println("Enter weight: ");
		double w = s.nextInt();
		System.out.println("Enter height: ");
		double h = s.nextInt();
		
		Patient p = new Patient(name,w,h);
		System.out.println("BMI :"+p.bmi(w,h));
		
	}

}
