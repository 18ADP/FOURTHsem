package CSW2_ClassLec;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		System.out.println(list1);
		//Traversing list through iterator.
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}

	}

}
