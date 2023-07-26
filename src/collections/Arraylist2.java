package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist2 {

	public static void main(String[] args) {

		HashSet<Object> list1=new HashSet<Object>();
		
		list1.add(20);

		list1.add("Hi");

		list1.add("Hello");
		System.out.println(list1);
		
ArrayList<Object> list2=new ArrayList<Object>(list1); // arralist has constructor we can pass set to arraylist
		                                             //even for arraylist we can pass inside set for remove dup value 
		list2.add(1);

		list2.add(2);

		list2.add(3);
		
		System.out.println(list2);

		
		

	}

}
