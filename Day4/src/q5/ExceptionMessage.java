package q5;
import java.util.*;
import java.io.*;

class NumberExceedException extends RuntimeException{
	NumberExceedException(){
		super();
	}
}
public class ExceptionMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int number = sc.nextInt();
				if (number == -1) {
					break;
				}
				if (number > 100)
					throw new NumberExceedException();
				if (number % 2 == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();

			} catch (NumberExceedException e) {
				System.out.println("Number can't be greater than 100");
			}
		}
		sc.close();

	}

}
