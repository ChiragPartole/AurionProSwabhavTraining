package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\07_stream_app\\src\\com\\aurionpro\\test\\test1");
			
			int ch;
			int letterCount =0;
			int wordCount =1;
			int lineCount=1;
			while((ch=fileInputStream.read()) != -1) {
				if((char)ch == ' ' || (char)ch == '\n' ||  (char)ch == '\t' && (char)ch != ' ' + ' ')   {
					wordCount++;
				}if((char)ch == '\n') {
					lineCount++;
					
				}
					letterCount++;
				
			}
			
			
			System.out.println("Number of characters: " + letterCount);
			System.out.println("Number of words: " + wordCount);
			System.out.println("Number of lines: " + lineCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}