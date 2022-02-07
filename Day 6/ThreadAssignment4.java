package com.demo.threads;

public class ThreadAssignment4 extends Thread{
	
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			if(i==5)
			{
				System.out.println(i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			else
				System.out.println(i);
				
		}
	}

	public static void main(String[] args) {
		
		
		ThreadAssignment4 t = new ThreadAssignment4();
		t.start();
		

	}

}
