/*  Output :-- 
 * 
    Book [bookTitle=Java in depth, bookAuthor=Herbert Schildt] found in Chesta collection
	Collection of all Books:
	Book [bookTitle=Effective Java, bookAuthor=Joshua Bloch]
	Book [bookTitle=Head First Java, bookAuthor=Kathy Sierra and Bert Bates]
	Book [bookTitle=Java in depth, bookAuthor=Herbert Schildt]
  
 */
package ques3_4;
import java.util.ArrayList;

import java.util.*;

public class BookCollection {
	private String ownerName;
	private ArrayList<Book> books;

	public BookCollection(String ownerName, ArrayList<Book> books) {
		this.ownerName = ownerName;
		this.books = books;
	}

	public void hasBook(Book b) {
		
		for (Book e : books) {
			if ((b.getBookTitle()).equals(e.getBookTitle()) && (b.getBookAuthor()).equals(e.getBookAuthor())) {
				System.out.println(b.toString() + " found in "+ this.ownerName +" collection");
				return;
			}
		}

		System.out.println(b.toString() + " not found in "+ this.ownerName + "collection");
	}

	

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [ownerName=");
		builder.append(ownerName);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}

	public void mySort() {
		Collections.sort(books, new BookSortAsPerTitleAndAuthor());

	}

}