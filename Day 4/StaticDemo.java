package com.demo.staticdemo;

class Area{
	
	// non static variable
	int length = 10;  //global variable
	
	static int length1 = 25; // global variable
	
		
	// non static method
	void showArea(int side) {
		
		int breadth = 20;  // local variable
		int temp = side*breadth;
		
		System.out.println(temp);
	}
	
	// static method
	static void showArea1(int side) {
		
		int breadth = 20;  // local variable
		int temp = side*breadth;
		
		System.out.println(temp);
	}
	
	static {
		
		System.out.println("-----From static block1-----"); // static block is always executed first
	}
	static {
		
		System.out.println("-----From static block2-----"); // static block is always executed first
	}
	
}

public class StaticDemo {
	
	public static void main(String args[]) {
		
		Area side = null; // class variable, which is static in nature (can access whatever is static)
		
		Area a = new Area(); // non static method
		a.showArea(40);
		
		side.showArea1(4); // this method is called without creating an object
	}

}
