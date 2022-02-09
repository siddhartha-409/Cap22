package com.demo.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("abc.txt");
		
		FileReader ioreader = new FileReader("abc.txt"); //mention the source for reading
		
		int i;
		
		while((i=ioreader.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		ioreader.close(); // close io connection using close() api

	}

}
