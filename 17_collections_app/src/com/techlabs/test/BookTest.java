package com.techlabs.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.techlabs.model.Book;
import com.techlabs.model.BookComparator;


public class BookTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book>();
		
		readBooks(books,scanner);
		displayBooks(books);

		sortingBooksByChoice(books,scanner);
	}
	
	private static void sortingBooksByChoice(ArrayList<Book> books, Scanner scanner) {
		boolean exit = false;
		
		while(exit == false) {
			System.out.println("--------------------------------");
			System.out.println("On which parameter you want to perform sorting?");
			System.out.println("enter\n1 for by title \n2 for author \n3 for price \n4 for publicationYear");
			System.out.println("5 for Sorting the books first by author, then by title, and finally by price.");	
			
			System.out.println("6 for Sort the books first by publication year, "
					+ "then by price, and finally by author. \n7 for exit");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: Collections.sort(books, new BookComparator.BookTitleComparator()); displayBooks(books); break;
			case 2: Collections.sort(books, new BookComparator.BookAuthorComparator()); displayBooks(books); break;
			case 3: Collections.sort(books, new BookComparator.BookPriceComparator()); displayBooks(books); break;
			case 4: Collections.sort(books, new BookComparator.BookPublicationYearComparator()); displayBooks(books); break;
			case 5:
				{
					Collections.sort(books, new BookComparator.BookAuthorComparator().thenComparing(new BookComparator.BookTitleComparator()
							.thenComparing(new BookComparator.BookPriceComparator())));
					displayBooks(books); 
					break;
				}
			case 6: 
				{
					Collections.sort(books, new BookComparator.BookPublicationYearComparator().thenComparing(new BookComparator.BookPriceComparator()
							.thenComparing(new BookComparator.BookAuthorComparator())));
					displayBooks(books); 
					break;
				}
			case 7: exit =true; break;
			default: System.out.println("Enter valid input"); break;
			}
		}
		System.out.println("Exiting...");
	}
	private static void displayBooks(ArrayList<Book> books) {
		for(Book book: books)
			System.out.println(book);
	}

	private static void readBooks(ArrayList<Book> books, Scanner scanner) {
		String title;
		String author;
		double price;
		int publicationYear;
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter details of Book"+(i+1));
			System.out.println("ENter title:");
			title = scanner.next();
			
			System.out.println("Enter author");
			author = scanner.next();
			
			System.out.println("Enter price");
			price = scanner.nextDouble();
			
			System.out.println("Enter publicationYear");
			publicationYear = scanner.nextInt();
			
			books.add(new Book(title,author,price,publicationYear));
			
		}
		
	}

}
