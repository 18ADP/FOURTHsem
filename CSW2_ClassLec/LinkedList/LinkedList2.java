package LinkedList;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<String>();
		System.out.println("Initial List of Elements"+ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Ravi");
		System.out.println("After invoking ADD Method "+ll);
		ll.add(1, "Gaurav");
		System.out.println("After invoking ADD(int index, E element) method : "+ll);
		LinkedList<String>ll2=new LinkedList<String>();
		ll2.add("Soona");
		ll2.add("Hanumat");
		ll.addAll(ll2);
		System.out.println("After invoking addAll(Collect<? extends E> method: "+ ll);
		LinkedList<String>ll3=new LinkedList<String>();
		ll3.add("Jhon");
		ll3.add("Rahul");
		ll.addAll(1,ll3);
		System.out.println("After invoking addAll(index,list) at specific position: "+ ll);
		ll.addFirst("Lokesh");
		System.out.println("After using addFirst:  "+ll);
		ll.addLast("Dhokesh");
		System.out.println("After using addLast:  "+ll);
		
		//Removing all elements.
		ll.removeAll(ll2);
		System.out.println("After using removeAll() : "+ ll);
		ll.removeFirst();
		System.out.println("After using removeFirst(): "+ ll);
		ll.removeLast();
		System.out.println("After using removeLast(): "+ ll);
		ll.removeFirstOccurrence("Vijay");
		ll.removeLastOccurrence("Ravi");
		System.out.println("After using removeFirstOccurrence and removeLastOccurrence methods: "+ ll);
	}

}
