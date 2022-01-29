package ques3_4;

import java.util.ArrayList;

import ques3_4.Book;
import ques3_4.BookCollection;
public class SearchBook {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		Book b1 = new Book("Effective Java", "Joshua Bloch");

		Book b2 = new Book("Head First Java", "Kathy Sierra and Bert Bates");

		Book b3 = new Book("Java in depth", "Herbert Schildt");
		books.add(b1);
		books.add(b2);
		books.add(b3);

		BookCollection myCollection = new BookCollection("Chesta", books);

	    myCollection.hasBook(b3);

		myCollection.mySort();
		System.out.println("Collection of all Books:");
		for (Book b : books) {
			System.out.println(b);
		}

	}

}
