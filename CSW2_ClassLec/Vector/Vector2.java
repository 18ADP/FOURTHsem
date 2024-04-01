package TryCatch;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector <String> v=new Vector<String>();
		v.add("Tiger");
		v.add("Lion");
		v.add("Dog");
		v.add("Elephant");
		System.out.println("Size is: "+ v.size());
		System.out.println("Default capacity is: "+ v.capacity());
		System.out.println("Elements are: "+ v);
		v.addElement("Rat");
		v.addElement("Cat");
		v.addElement("Deer");
		System.out.println("Size after addition: "+ v.size());
		System.out.println("Capacity after addition: "+ v.capacity());
		System.out.println("Final elements are: "+ v);
		if(v.contains("Tiger")) {
			System.out.println("Tiger is present at index: "+ v.indexOf("Tiger"));
		}
		else {
			System.out.println("Tiger is not presenyt in the list.");
		}
		
		//Get the first list.
		System.out.println("The first animal in vector is: "+ v.firstElement());
		//Get the last list.
				System.out.println("The last animal in vector is: "+ v.lastElement());
	}
	
   

}
