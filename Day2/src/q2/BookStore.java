package q2;

import java.util.Scanner;

public class BookStore {
	private int size=10;
	private int capacityTillNow=0;
	private Book books[]=new Book[size];
	public void display() {
		if (capacityTillNow == 0) {
			System.out.println("BookStore is Empty");
			return;
		}else {
		for (int j = 0; j < capacityTillNow; j++) {
			books[j].display();
		}
		}
	}
	public void order(String ISBN, int noOfCopies) {
		
		for(int j=0;j<capacityTillNow;j++) {
			if(books[j].getISBN().equals(ISBN)) {
				books[j].setNumOfCopies(books[j].getNumOfCopies()+noOfCopies);
			}
		}
			
				System.out.println("Book not found Please enter details of book");
				insertNewBook(ISBN,noOfCopies);
			
		}
	
	public void insertNewBook(String ISBN, int noOfCopies) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Title");
		String bookTitle=sc.nextLine();
		System.out.println("Enter author name");
		String author=sc.nextLine();
			if (capacityTillNow < size) {
			books[capacityTillNow] = new Book(bookTitle, author, ISBN, noOfCopies);
			capacityTillNow++;
			System.out.println("New book Added");
			return;
		} else {
			System.out.println("Book Store is full");
		}
		sc.close();
	}
	public void sell(String bookTitle, int noOfCopies) {
		for(int j=0;j<capacityTillNow;j++) {
			if(books[j].getBookTitle().equals(bookTitle)) {
			if(books[j].getNumOfCopies()>=noOfCopies) {
				books[j].setNumOfCopies(books[j].getNumOfCopies()-noOfCopies);
				System.out.println("Book copies Sold");
				return;
			}
			else {
				System.out.println("Insufficient copies available");
				return;
			}
			}
		}
			
				System.out.println("No such book found");
			
		
	}
}