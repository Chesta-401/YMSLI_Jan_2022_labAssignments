package ques2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Frequency {

	public static void main(String[] args) {

		Map<String, Integer> hm =new HashMap<String, Integer>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VE00YM334\\Desktop\\LabAssignments\\Day5\\src\\ques2\\story.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {

				String string[] = line.split(" ");

				for (String s : string) {
					s= s.toLowerCase();

					
					if(hm.containsKey(s)) {
						hm.put(s, hm.get(s)+1);
					}else {
						hm.put(s, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Set<Entry<String, Integer>> entrySet = hm.entrySet();

		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" appear "+ entry.getValue() + " times");
		}

	}


}


