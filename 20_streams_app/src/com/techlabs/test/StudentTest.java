package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		
		
		// with FileInputStream
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\Aurionpro_training\\20_streams_app\\src\\com\\techlabs\\model\\students");
			
			int ch;
			while((ch=fileInputStream.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//with stream
		String filePath = "D:\\Aurionpro_training\\20_streams_app\\src\\com\\techlabs\\model\\students";
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

			System.out.println();
			System.out.println("Using stream");
			stream.forEach((word)-> System.out.println(word));

			Stream<String> stream2 = Files.lines(Paths.get(filePath));
			List<String> linesUpperCase = stream2.map((word)-> word.toUpperCase())
												.collect(Collectors.toList());
			
			linesUpperCase.stream().forEach((word)->System.out.println(word));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
