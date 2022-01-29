package ques5;
import java.io.*;
import java.util.*;

public class BiggestDoubleNumber {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<>();
		try(BufferedReader br  = new BufferedReader(new FileReader("C:\\Users\\VE00YM334\\Desktop\\LabAssignments\\Day5\\src\\ques5\\data.txt"))){
			String s;
			while((s=br.readLine())!=null) {
				al.add(Double.parseDouble(s));

			}
		}
		catch(IOException e) {

		}

		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}
}
