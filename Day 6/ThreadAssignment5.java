package com.demo.threads;

class even extends Thread
{
	
	
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}

class odd extends Thread
{
	
	
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}

public class ThreadAssignment5 {

	public static void main(String[] args) {
		
		even e = new even();
		odd o = new odd();
		
		//o.setPriority(10); (this or join block do the same thing,i.e.,join method first completes the thread to which it is applied.)
		
		o.start();
		
		try {
			o.join();
		} catch (InterruptedException e1) {			
			e1.printStackTrace();
		}
		
		
		e.start();		

	}

}
