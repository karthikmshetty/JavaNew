package collections;

import java.util.PriorityQueue;

public class Queue_Priority {

	public static void main(String[] args) {

		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		
		pq.add(10);
		pq.add(20);
     	pq.add(40);
        pq.add(30);
		
		System.out.println(pq);
		System.out.println();
		
	}

}
