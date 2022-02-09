package com.demo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class IOassignment3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input file name");
		String file1 = sc.nextLine();
		System.out.println("Enter output file name");
		String file2 = sc.nextLine();
		
		sc.close();
		
		FileReader in = new FileReader(file1);
		FileWriter out = new FileWriter(file2);
		
		BufferedReader br = new BufferedReader(in);		
		BufferedWriter bw = new BufferedWriter(out);		
        
		
		Map<String, Integer> map = new TreeMap<>();
		
		String line;
		
		while ((line = br.readLine()) != null) 
		{
			//line = line.trim();
			String words[] = line.split(" ");
						
			for (String word : words) 
			{
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
			}		
			
		}
		
		for(Entry<String, Integer> i:map.entrySet())
		{
			bw.write(i.getKey()+":"+i.getValue()+"\n");
		}
		
		br.close(); //important
		bw.close(); //important
		
			

	}

}
