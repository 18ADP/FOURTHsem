package Tree;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet <Integer> tr= new TreeSet<>();
		tr.add(1);
		tr.add(2);
		tr.add(3);
		tr.add(3);
		tr.add(4);
		tr.add(5);
		Iterator<Integer> i=tr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("The SET is: "+ tr);
		 System.out.println("Traversing element through iterator in descending order");
		 Iterator<Integer> itr=tr.descendingIterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
             System.out.println("Lowest Value "+ tr.pollFirst());
             System.out.println("Highest Value "+ tr.pollLast());
		 

	}

}
