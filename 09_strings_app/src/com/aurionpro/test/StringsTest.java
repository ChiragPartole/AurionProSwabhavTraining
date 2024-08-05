package com.aurionpro.test;

public class StringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name1 = "abc";
//		String name2 = "abc";
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name1 ==name2);
//		
//		String name3= new String("abc");
//		String name4= new String("abc2");
//		System.out.println(name3.hashCode());
//		System.out.println(name4.hashCode());
//		System.out.println(name3 ==name4);
//		
//		String name = "Chirag";
//		System.out.println(name.hashCode());
//		name = name+ "Partole";
//		System.out.println(name.hashCode());
		
		StringBuffer name5 = new StringBuffer("Chirag");
		System.out.println(name5.hashCode());
		name5 = name5.append("Partole");
		System.out.println(name5.hashCode());
		
		StringBuilder name6 = new StringBuilder("Chirag");
		System.out.println(name6.hashCode());
		name6.append("Partole");
		System.out.println(name6.hashCode());

	}

}
