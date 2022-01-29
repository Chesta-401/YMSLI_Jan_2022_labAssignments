
/* Create a class and a method named throwException which will throw 2 exceptions 1)
InputException and 2) IOExcception. Now from the main method call this throwException
method; notice what the IDE suggest to fix the error. Choose the try/catch solution. How many
catch blocks have been added and why
 */
package q7;
import java.util.*;



import java.io.*;

import q6.InputException;

// 2 catch blocks are used for two exceptions IOException and InputException as they both are different (not applicable for multi-catch block) )

public class CatchBlocks {

		
	public static void throwException() throws IOException, InputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int no = sc.nextInt();
		if (no > 100) {
			throw new InputException(100);
		} else {
			throw new IOException();
		}
	}

	public static void main(String[] args) {
		try {
			throwException();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InputException e) {

			e.printStackTrace();
		}

	}

		

	}


