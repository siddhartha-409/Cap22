package com.demo.threads;

class Salespersons extends Thread
{
	public void run()
	{
		System.out.println("Ram");
		System.out.println("Shyam");
		System.out.println("Fam");
		System.out.println("Nam");
		System.out.println("Jam");
	}
}

public class Days extends Thread {
	
	public void run()
	{
		String day[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		for (int i=0;i<day.length;i++)
		{
			System.out.println(day[i]);
		}
					
	}

	public static void main(String[] args) {
		
		
		
		Salespersons sp =new Salespersons();
		Days d = new Days();
		
		
		d.start();
		sp.start();
		

	}

}
