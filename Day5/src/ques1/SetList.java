package ques1;
import java.util.*;


public class SetList {

	public static void main(String[] args) {
		List <Integer> l = new ArrayList<Integer>();
		
		Set<Integer> set = new HashSet<>();
		l.add(12);
		l.add(3);
		set.addAll(l);
		set.add(9);
		l.remove(0);
		System.out.println(l);
		System.out.println(set);
		l.removeAll(set);
		System.out.println(l);
		System.out.println(l.size());
		Iterator itr  = set.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer )itr.next();
			if(i==3) {
				itr.remove();
			}
		}
		System.out.println(set);
		l.clear();
		
	}

}
