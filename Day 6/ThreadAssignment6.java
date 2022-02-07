package com.demo.threads;

public class ThreadAssignment6 extends Thread{
	
	public void run()
	{
		System.out.println("Running"+Thread.currentThread());
	}

	public static void main(String[] args) {
		
		ThreadAssignment6 t1 = new ThreadAssignment6();
		ThreadAssignment6 t2 = new ThreadAssignment6();
		ThreadAssignment6 t3 = new ThreadAssignment6();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
