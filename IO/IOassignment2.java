package com.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOassignment2 {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter input file name:");
		String file1 = s.next();
		
		System.out.println("Enter output file name:");
		String file2 = s.next();
		
		FileInputStream fin =new FileInputStream(file1);
		
		FileOutputStream fout =new FileOutputStream(file2);
		
		int i;
		
		while((i=fin.read())!=-1)
		{
			fout.write(i);
			System.out.println(i);
		}

	}

}
