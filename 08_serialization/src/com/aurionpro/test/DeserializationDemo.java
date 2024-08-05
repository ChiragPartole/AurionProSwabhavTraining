package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {


	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\08_serialization\\src\\com\\aurionpro\\test\\test1.txt");		
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Student obj = (Student) objectInputStream.readObject();
			System.out.println(obj.studentId);
			System.out.println(obj.studentName);
			System.out.println("Deserialization done!");
			objectInputStream.close();
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}