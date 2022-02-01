package com.demo.inher;

interface Car{
	
	void speed();
	void brake();
	void lights();
}

class LuxuryCar implements Car{

	@Override
	public void speed() {

		System.out.println("300km/hr");
		
	}

	@Override
	public void brake() {
		
		System.out.println("disk brake");
		
	}

	@Override
	public void lights() {
				
		System.out.println("high vision lights");
	}
	
}

class CheapCar implements Car{

	@Override
	public void speed() {

		System.out.println("100km/hr");
		
	}

	@Override
	public void brake() {
		
		System.out.println("not disk brake");
		
	}

	@Override
	public void lights() {
				
		System.out.println("low vision lights");
	}
	
}

public class InterfaceDemo {
	
	public static void main(String args[]) {
		
		LuxuryCar l = new LuxuryCar();
		l.brake();
		
		CheapCar c = new CheapCar();
		c.brake();
	}

}
