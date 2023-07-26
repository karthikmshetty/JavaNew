package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<Object> list1=new ArrayList<Object>();
		
		list1.add(20);

		list1.add("Hi");

		list1.add("Hello");

		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
		list2.add(10);
		list2.add(50);
		list2.add(30);
		list2.add(60);
		list2.add(20);
		list2.add(40);
		
		System.out.println("Unsorted list :"+list2);
		
		Collections.sort(list2);  //for object type this sort is not working so Integer in <>

		System.out.println("Sorted list :"+list2);

		
		
		
	}

}
