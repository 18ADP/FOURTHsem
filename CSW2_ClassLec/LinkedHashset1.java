package oops;
import java.util.*;
public class LinkedHashset1 {

	public static void main(String[] args) {
		//Creating Hashset and adding elements.
		LinkedHashSet<String> L_set=new LinkedHashSet<String>();
		L_set.add("ONE");
		L_set.add("TWO");
		L_set.add("THREE");
		L_set.add("FOUR");
		L_set.add("FIVE");
		Iterator<String> i=L_set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println(L_set);
		
		// TODO Auto-generated method stub

	}

}
