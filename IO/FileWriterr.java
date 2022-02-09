package com.demo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("inputfile.txt");
		
		FileWriter out = new FileWriter("fileWriter.txt");
		
		int i;
		while((i=in.read())!=-1) {
			out.write(i);
		}
		in.close();
		out.close();

	}

}
