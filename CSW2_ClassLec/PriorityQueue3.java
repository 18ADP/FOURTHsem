package oops;
import java.util.*;
public class PriorityQueue3 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(10);
		pq.add(1);
		pq.add(3);
		pq.add(6);
		pq.add(5);
		pq.add(4);
		pq.add(2);
		pq.add(9);
		pq.add(7);
		pq.add(8);
		pq.add(0);
		System.out.println(pq);
		System.out.println("peek: "+ pq.peek());
		pq.poll();
		System.out.println("Prority Queue after removing: "+ pq);
		System.out.println("Does the queue contains 3? "+ pq.contains(3));
		System.out.println("Size of the Queue: "+pq.size());
		pq.clear();
		System.out.println("Is the queue empty: "+ pq.isEmpty());
		// TODO Auto-generated method stub

	}

}
