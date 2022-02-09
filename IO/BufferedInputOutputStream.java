package com.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("inputfile.txt");
		BufferedInputStream in = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream("bufferedOutput.txt");
		BufferedOutputStream out = new BufferedOutputStream(fout);
		
		int i;
		while((i=in.read())!=-1) {
			out.write(i);
		}
		in.close();
		out.close();

	}

}
