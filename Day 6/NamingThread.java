package com.demo.threads;

class NamingThreadDemo extends Thread{
	
	// predefined method
	public void run() {
		
		System.out.println("Running..");
	}
}


public class NamingThread {

	public static void main(String[] args) {
		
		NamingThreadDemo t1 = new NamingThreadDemo();
		t1.start();
		t1.setName("sid-thread");
		
		System.out.println("Get the name of thread"+t1.getName());
		
		//t1.setPriority(0);

	}

}
