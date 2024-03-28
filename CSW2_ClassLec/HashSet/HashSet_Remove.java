package HashSet;

import java.util.HashSet;

public class HashSet_Remove {
	public static void main(String args[]) {
		HashSet <String> set= new HashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements: "+set);
		//Removing specific element.
		set.remove("Ravi");
		System.out.println("After invoking remove(object) method: "+ set);
		HashSet <String> set1= new HashSet<>();
		set1.add("Ajay");
		set1.add("Gau");
		set.addAll(set1);
		System.out.println("Updated list: "+ set);
		//Removing all elements from hashset.
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: "+ set);
		//Removing elements on basis of specified condition.
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: "+ set);
		//Removing all elements.
		set.clear();
		System.out.println("After invoking clear() method:  "+ set);
	}

}
