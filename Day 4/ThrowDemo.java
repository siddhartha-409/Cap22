package com.demo.exceptionhandling;

import java.io.IOException;

class M{
	
	void show() throws IOException{
		
		System.out.println("Inside show()");
		
		throw new IOException("device error");
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		
		M s = new M();
		
		try {
			s.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
