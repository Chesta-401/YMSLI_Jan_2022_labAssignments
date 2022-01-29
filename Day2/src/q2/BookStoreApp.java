/*Create a book store application which will help a book store to keep the record of its books. 
For each book, the application will have the Book Title, Book Author, Book ISBN along with the number of copies for
each book. The system will allow you to display all books, order new/existing books and sell books. With 
sell or order of existing books, number of copies will decrease/increase. With order of new book, a new book
entry will be added to the system. The system will display a menu on the screen for the user to choose from. 
Here is the menu.
Enter “1”, to display the Books: Title – Author – ISBN - Quantity.
Enter “2”, to order new books.
Enter “3”, to sell books. 
Enter “0”, to exit the system.
*/
package q2;


import java.util.*;

public class BookStoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore bookStore = new BookStore();
	int t=1;
	while(t==1) {
			System.out.println("Enter “1”, to display the Books. \n" + "Enter “2”, to order new books.\n"
					+ "Enter “3”, to sell books.\n" + "Enter “0”, to exit the system.");
			int choice = sc.nextInt();
			if (choice == 1) {
				bookStore.display();
				
			} else if (choice == 2) {
				System.out.println("Enter ISBN ");
				String isbn = sc.next();
				
				System.out.println("Enter Number of copies");
				int noOfCopies = sc.nextInt();
				bookStore.order(isbn, noOfCopies);
			} else if (choice == 3) {
				System.out.println("Enter bookTitle");
				String bookTitle = sc.next();
				
				System.out.println("Enter Number of copies");
				int noOfCopies = sc.nextInt();
				bookStore.sell(bookTitle, noOfCopies);
			}
			else {
				t = 0;
			}
		}
	}

	}

