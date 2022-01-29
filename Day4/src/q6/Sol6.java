/* Now create your own exception named “InputException” which will take an integer (let’s say n) as
	parameter and set the exception message to “Number can’t be greater than [n]”. Modify the
	program in #1 to throw InputException when the number is greater than 100. So, the exception
	message will be “Number can’t be greater than 100”. Catch the exception and display the
	exception message.
 */
package q6;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Sol6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum limit for number");
		System.out.println("Max Limit: ");
		int n = sc.nextInt();
		while (true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int num = sc.nextInt();
				if (num == -1) {
					break;
				}
				if (num > n)
					throw new InputException(n);
				if ((num &1) == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				sc.next();

			} catch (InputException ex) {
				System.out.println(ex.getMessage());
			}
		}
		sc.close();
	}



}


