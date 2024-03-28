package PriorityQueue;

import java.util.*;

public class Priority_Queue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<3;i++) 
			pq.add(i);
		    pq.add(1);
		
		
		System.out.println(pq);
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.add("C");
		pq1.add("B");
		pq1.add("A");
		System.out.println(pq1);
		// TODO Auto-generated method stub

	}

}
