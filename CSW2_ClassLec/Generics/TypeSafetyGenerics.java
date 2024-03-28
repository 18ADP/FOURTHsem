package Generics;
import java.util.*;

public class TypeSafetyGenerics {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(10);
		//list.add("10");------------------> ONLY INTEGERS CAN BE EXECUTED AS ITS DEFINED AS INTEGER IN GENERICS.
		System.out.println(list.get(0));
		

	}

}
