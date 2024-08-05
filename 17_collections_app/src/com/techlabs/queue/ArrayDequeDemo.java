package com.techlabs.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("ankit");  
	    deque.add("rohit");  
	    deque.add("manish");  
	    deque.offerFirst("jay"); 
	    deque.addFirst("chirag");
	     
	    for(String s:deque){  
	        System.out.println(s);  
	    }   
	    deque.pollLast();  
	    System.out.println("After pollLast()");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	}  
	}  