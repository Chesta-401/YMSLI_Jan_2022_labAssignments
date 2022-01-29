package ques3_4;

import java.util.Comparator;

public class Book {
	private String bookTitle;
	private String bookAuthor;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Book(String bookTitle, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookTitle=");
		builder.append(bookTitle);
		builder.append(", bookAuthor=");
		builder.append(bookAuthor);
		builder.append("]");
		return builder.toString();
	}



}

class BookSortAsPerTitleAndAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		int val = (b1.getBookTitle().toLowerCase()).compareTo(b2.getBookTitle().toLowerCase());
		if (val == 0) {
			val = (b1.getBookAuthor().toLowerCase()).compareTo(b2.getBookAuthor().toLowerCase());
		}
		return val;
	}
}
