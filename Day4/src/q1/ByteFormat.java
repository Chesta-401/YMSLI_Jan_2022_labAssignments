
/*
Write a program to Read from file in byte format and Write to command prompt in both byte format and using
formatted output(System.out.print or println)
*/
package q1;
import java.io.*;
import java.io.FileInputStream;

public class ByteFormat {

	private static void readWrite(File file) {
		byte[] byteArray = new byte[(int) file.length()];
		try (FileInputStream fis = new FileInputStream(file)) {

			fis.read(byteArray);

			for (byte i : byteArray) {
				System.out.print(i + " ");
			}
			System.out.println();

			for (byte j : byteArray) {
				System.out.print((char) j);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\VE00YM334\\Desktop\\LabAssignments\\Day4\\src\\q1\\myfile.txt");
		readWrite(file);
	}
}