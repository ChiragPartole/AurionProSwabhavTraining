package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.studentId = 1;
		s1.studentName = "Chirag";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Aurionpro_training\\08_serialization\\src\\com\\aurionpro\\test\\test1.txt");
			
			try {
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(s1);
				System.out.println("Object saved in test1.txt");
				System.out.println("Serialization done!");
				
				objectOutputStream.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
