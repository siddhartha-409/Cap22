package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOassignment1 {

	public static void main(String[] args) throws IOException  {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the file name:");
		String file = s.next();
		
		System.out.println("Enter the character to be counted:");
		char c = (s.next().charAt(0));
		
		
		FileReader ioreader = new FileReader(file);
		
		int n=0;
		int i;
		
		while((i=ioreader.read())!=-1)
		{
			if (i >= 65 && i<= 90)
				i += 32;
			if (c >= 65 && c <= 90)
				c += 32;
			if(i==c)
				n+=1;
			
		}
		
		System.out.println("File "+file+" has "+n+" instances of letter "+c);

	}

}
