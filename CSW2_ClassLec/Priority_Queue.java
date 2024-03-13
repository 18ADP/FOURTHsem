package oops;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Where");
		pq.add("Have");
		pq.add("You");
		pq.add("Been");
		System.out.println("Initail priorityQueue: "+pq);
		pq.remove("Have");
		System.out.println("After remove: "+pq);
		System.out.println("After poll method: "+pq.poll());
		System.out.println("After peek method: "+pq.peek());
		System.out.println("Final priorityQueue: "+ pq);
	}

}
