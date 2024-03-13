package oops;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet <String> set= new HashSet<>();
		set.add("ONE");
		set.add("TWO");
		set.add("THREE");
		set.add("THREE");
		set.add("FOUR");
		set.add("FIVE");
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("The SET is: "+ set);

	}

}
