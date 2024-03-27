package CSW2_ClassLec;
import java.util.*;
public class Array_List2 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		System.out.println("Returning element: "+ list1.get(1));
		//Changing element.
		list1.set(1, "Dates");
		//Traversing list.
		for(String fruit:list1)
			System.out.println(fruit);
		// TODO Auto-generated method stub

	}

}
