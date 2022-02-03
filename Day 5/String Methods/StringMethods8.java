package com.demo.strings;

import java.io.UnsupportedEncodingException;

public class StringMethods8 {

	public static void main(String[] args) {
		
		String s = "Shyam Singha Roy";		
		
		
		System.out.println(s.getBytes());
		
		
		try {
			byte byteArr[] = s.getBytes("UTF-16");
			
			for (int j = 0; j < byteArr.length; j++)   
			{  
				System.out.print(byteArr[j]);  
			}  
			System.out.println();
			
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 		
		
		
		try {
			System.out.println(s.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		try {
			System.out.println(s.getBytes("UTF"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}
