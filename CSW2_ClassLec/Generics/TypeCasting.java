package Generics;
import java.util.*;
public class TypeCasting {

	public static void main(String[] args) {
		//NON_GENERIC
		List list=new ArrayList();
		list.add("Hello");
		String s=(String)list.get(0);
		System.out.println(s);
		
		//GENERIC
		List<String> lists=new ArrayList<String>();
		lists.add("hello");
	    String sl=lists.get(0);
		System.out.println(sl);

	}

}
