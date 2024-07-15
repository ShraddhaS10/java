package com.gvacharya.inputoutputpackages.readwritedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReadWriteData {

	public static void main(String[] args) throws IOException {
		// input keyboard

//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		try {
//			System.out.println("Enter Number:");
//			int number = Integer.parseInt(br.readLine());
//			System.out.println(number);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
////			isr.close();
//			br.close();
//		}

		// file read write Operation
		String line = "";
		StringBuilder sBuilder = new StringBuilder();
		try (
				BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bWriter = new BufferedWriter(new FileWriter("demo.txt"));
			) {
			while (!line.equals("$")) {
				line = bReader.readLine();
				if(!line.equals("$")) {
					bWriter.write(line);
					bWriter.newLine();
				}
			}
		}
		
		try(
				BufferedReader bReader = new BufferedReader(new FileReader("demo.txt"));
			){
			
			while((line = bReader.readLine())!=null) {
				sBuilder.append(line);
				System.out.println(line);
			}
			
		}
		
		String result=sBuilder.toString();
		
		System.out.println("sBuilder:" + result);
		
		StringTokenizer tokens = new StringTokenizer(result,"[,.:; ]");
		String[] tokenArray = new String[tokens.countTokens()];
		int i=0;
		while(tokens.hasMoreTokens())
			tokenArray[i++]=tokens.nextToken();
		
		
		int counter=0;
		for(String str:tokenArray) 
			if(str.equalsIgnoreCase("shelu"))
				counter++;
				
		System.out.println("Shelu:" + counter);		
				
		
		
		
	}
}
