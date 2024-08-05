package com.aurionpro.model;

public class Book {
	
	private int bookId;
	private String name;
	private String author;
	private int price;
	
	public Book(){
		bookId =0;
		name ="abc";
		author="xyz";
		price =0;
	}
	public Book(int bookId,String name,String author,int price) {
		this.bookId =bookId;
		this.name =name;
		this.author=author;
		this.price =price;
	}
	public int getBookId() {
		return this.bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Book ID: "+this.bookId);
		System.out.println("Name: "+this.name);
		System.out.println("Author: "+this.author);
		System.out.println("Price: "+this.price);
	
		System.out.println("-----------------------");
	}
}
