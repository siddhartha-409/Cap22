package com.demo.exceptionhandling;

class MyException extends Exception{
	
	MyException(String message){
		
		super(message);  // calling the super class constructor of Exception
	}
}

public class CustomizedExceptionDemo {
	
	public static void main(String args[]) {
		
		try {
			
			throw new MyException("This is my own exception");
		}catch(MyException e) {
			
			System.out.println("Caught");
		}
		
		
	}

}
