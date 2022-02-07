package com.demo.exceptionhandling;

class Errors extends Exception{
	
	Errors(String msg){
		
		super(msg);
	}
}

public class Exceptionhandling7 {	
	

	public static void main(String[] args) {
		
		String name = args[0];
		int n = Integer.parseInt(args[1]);
				
		try
		{
			if(n>=18 && n<60)
				System.out.println("All good");
			
			else
				throw new Errors("Not eligible age");			
			
		}
		
		catch(Errors e)
		{
			System.out.println(e);
		}
				
		

	}

}
