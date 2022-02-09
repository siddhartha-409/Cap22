package com.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterInputOutputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("inputfile.txt");
		FilterInputStream in = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream("filterInOut.txt");
		FilterOutputStream out = new BufferedOutputStream(fout);
		
		int i;
		while((i=in.read())!=-1) {
			out.write((char)i);
		}
		
		in.close();
		out.close();

	}

}
