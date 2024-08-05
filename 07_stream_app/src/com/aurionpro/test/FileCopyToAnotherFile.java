package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyToAnotherFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\07_stream_app\\src\\com\\aurionpro\\test\\test1");
			
			int ch;
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro_training\\07_stream_app\\src\\com\\aurionpro\\test\\test2");
			
			
			while((ch=fileInputStream.read()) != -1) {
				fileOutputStream.write(ch);
			}
			System.out.println("File copied successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}