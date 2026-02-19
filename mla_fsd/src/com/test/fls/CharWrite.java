package com.test.fls;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class CharWrite {
	public static void main(String[] args) throws Exception{
		FileWriter fe=new FileWriter("src/ct.txt");
		BufferedWriter bw=new BufferedWriter(fe);
		
		String msg="This is simple char stream write and read operation";
		bw.write(msg);
		bw.flush();
		
		System.out.println("Done.");
		
		
	}

}
