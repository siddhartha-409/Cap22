package comdemo;

class Addition{
	
	void Add() {
		int l = 10;
		int b = 20;
		
		int area = l*b;
		
		System.out.println("Area is " + area);		
				
		
	}
}

public class MethodDemo {
	
	public static void main(String args[]) {
		
		Addition a = new Addition();
		
		a.Add();
	}

}
