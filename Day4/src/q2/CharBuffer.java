/*
 Write a program to Read from command prompt using character buffer and Write to a file using character 
buffer.
 */
package q2;
import java.util.*;
import java.io.*;

public class CharBuffer {
	private static void write(File file) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter text to be written in the file");
			String txt = sc.nextLine();
			writer.write(txt);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private static void read(File file) {
		String string = null;
		try (BufferedReader bReader = new BufferedReader(new FileReader(file))) {
			while ((string = bReader.readLine()) != null) {
				System.out.println(string);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\VE00YM334\\Desktop\\LabAssignments\\Day4\\src\\q2\\CharBufferFile.txt");
		write(file);
		read(file);
	}
}




