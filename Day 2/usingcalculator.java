package day2.assignments;

class calculator{
	
	static int powerInt(int num1, int num2) {
		
		return (int) Math.pow(num1,num2);
	}
	
	static double powerDouble(double num1, double num2) {
		
		return Math.pow(num1,num2);
	}
	
	
}

public class usingcalculator {
	public static void main(String args[]) {
		
		System.out.println(calculator.powerInt(5,6));
		System.out.println(calculator.powerDouble(5,6));
		
	}

}
