package com.demo.collection;

import java.util.ArrayList;
import java.util.Vector;

public class Vector1 {
	
	Vector<Integer> v1 = new Vector<Integer>();
	
	Vector<Integer> saveEvenNumbers(int N)
	{
		for(int i=2;i<=N;i+=2)
		{
			v1.add(i);
		}
		return v1;
	}
	
	Vector<Integer> v2 = new Vector<Integer>();
	
	Vector<Integer> printEvenNumbers()
	{
		for(int i:v1)
		{
			i*=2;
			v2.add(i);
		}
		return v2;
	}
	
	boolean flag = false;
	
	int printEvenNumber(int N)
	{
		for(int i:v1)
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
		
		Vector1 a = new Vector1();
		System.out.println(a.saveEvenNumbers(6));
		System.out.println(a.printEvenNumbers());
		System.out.println(a.printEvenNumber(2));
		
				
		
	}
	
	

}
