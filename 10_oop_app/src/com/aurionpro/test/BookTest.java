package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.Book;
import com.aurionpro.model.CricketPlayer;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of books: ");
		int size = scanner.nextInt();
		
		Book[] books = new Book[size];
		for(int i=0;i<books.length;i++) {
			System.out.println("Enter bookId: ");
			int bookId = scanner.nextInt();
			System.out.println("Enter name: ");
			String name = scanner.next();
			System.out.println("Enter author: ");
			String author = scanner.next();
			System.out.println("Enter price: ");
			int price = scanner.nextInt();
			
			books[i] = new Book(bookId,name,author,price);
			System.out.println("------------------");
		}
		
		System.out.println("Before sorting");
		for(int i=0;i<books.length;i++) {
			books[i].display();
		}
		

		// Arrays.sort(books,(a,b) ->Integer.compare(b.getPrice(),a.getPrice()));
		
		Arrays.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o2.getPrice() - o1.getPrice();
			}
		});
		
		System.out.println("After sorting");
		for(int i=0;i<books.length;i++) {
			books[i].display();
		}

	}

}