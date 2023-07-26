package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		
		LinkedList<Object> link1 = new LinkedList<Object>();
		
		link1.add(10);
		link1.add(20);

		link1.add("Hi");

		link1.add("Hello");

		link1.add(null);
		System.out.println(link1);

		link1.addFirst("how r u"); // To add value in first
		
		System.out.println(link1);
		
		link1.addLast("fine "); // To add value in last
		System.out.println(link1);
		
		


	}

}
