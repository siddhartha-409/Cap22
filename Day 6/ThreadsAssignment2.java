package com.demo.threads;

import java.util.Random;

public class ThreadsAssignment2 implements Runnable{

	public static void main(String[] args) {		
		
		
		ThreadsAssignment2 ta = new ThreadsAssignment2();
		
		Thread t = new Thread(ta);
		
		t.start();
		
		
	}					
		
		
	@Override
	public void run() {
		
		String colours[]={"white","blue","black","green","red","yellow"};
		
		Random random = new Random();   
		 
		int n = random.nextInt(6); 
		
		while(n!=4)	
		{
			System.out.println(colours[n]);		
			n = random.nextInt(6);
		}
		
		
	}

}
