package com.demo.threads;

public class ThreadsAssignment1 extends Thread{

	public static void main(String[] args) {
		
		ThreadsAssignment1 t1 = new ThreadsAssignment1();
		ThreadsAssignment1 t2 = new ThreadsAssignment1();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		

	}

}
