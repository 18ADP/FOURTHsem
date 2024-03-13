package oops;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet <String> tr= new TreeSet<>();
		tr.add("A");
		tr.add("B");
		tr.add("C");
		tr.add("D");
		tr.add("E");
		System.out.println("Initial set: "+ tr);
		
		System.out.println("Reverse set"+tr.descendingSet());
		System.out.println("Head set: "+ tr.headSet("D",true));
		System.out.println("Sub set: "+ tr.subSet("A",false,"E",true));
		System.out.println("Tail set: "+ tr.tailSet("C",false));

	}

}
