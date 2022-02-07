package com.demo.wrapper;

public class WrapperInSwitchCaseExample {

	public static void main(String[] args) {
		
		String age = "18";
		int dummy = Integer.parseInt(age);  // primitive value
		
		Integer ageobject = new Integer(dummy);
		
		switch(ageobject)
		{
		
		case(16):
			System.out.println("You are under 18");
		break;
		case(18):
			System.out.println("You are eligible for vote");
		break;
		case(65):
			System.out.println("You are senior citizen");
		break;
		default:
			System.out.println("Plz give valid age");
		break;
		}

	}

}
