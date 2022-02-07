package com.demo.threads;
//Using runnable interface in thread class

class RunnableDemo implements Runnable{
	
	Thread t;
	String ThreadName;
	
	//constructor 
	RunnableDemo(String threadName){
		
		ThreadName = threadName;
		System.out.println("Creating "+threadName);
	}
	
	// Write logic here
	
	public void run() {
		
		try {
			
			for(int i=8;i>0;i--)
			{
				System.out.println("Thread "+ThreadName+" ,"+i);
				Thread.sleep(7000);   // this will catch the cpu time of windows os
			}
			
		}
		catch(InterruptedException e) {
			
			System.out.println("Thread "+ThreadName+" has been interrupted");
			
		}
	}
	
	public void start() {
		
		System.out.println("Thread is starting "+ThreadName);
		
		if(t==null) {
			
			t= new Thread(this, ThreadName); // new thread created and assign the name to thread class
			t.start();
		}
		
	}
	
}

public class RunnableDemoMain {

	public static void main(String[] args) {
		

		ThreadDemo1 t1 = new ThreadDemo1(" thread 1 ");
		t1.start();
		
		ThreadDemo1 t2 = new ThreadDemo1(" thread 2 ");
		t2.start();
		
		

	}

}
