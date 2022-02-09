package com.demo.collection;

import java.util.ArrayList;

public class ArrayList1 {
	
	ArrayList<Integer> A1 = new ArrayList<Integer>();
	
	ArrayList<Integer> saveEvenNumbers(int N)
	{
		for(int i=2;i<=N;i+=2)
		{
			A1.add(i);
		}
		return A1;
	}
	
	ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	ArrayList<Integer> printEvenNumbers()
	{
		for(int i:A1)
		{
			i*=2;
			A2.add(i);
		}
		return A2;
	}
	
	boolean flag = false;
	
	int printEvenNumber(int N)
	{
		for(int i:A1)
		{
			if (i==N)
			{
				flag = true;
				break;
			}
		}
		if(flag==false)
			return 0;
		else
			return N;
	}

	public static void main(String[] args) {
		
		ArrayList1 a = new ArrayList1();
		System.out.println(a.saveEvenNumbers(6));
		System.out.println(a.printEvenNumbers());
		System.out.println(a.printEvenNumber(2));
		
				
		
	}

}
