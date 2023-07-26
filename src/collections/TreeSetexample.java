package collections;

import java.util.TreeSet;

public class TreeSetexample {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(40);
        set.add(50);
		set.add(200);
		set.add(30);
		set.add(10);
		

		System.out.println(set);
		//For descending
		System.out.println(set.descendingSet());
		
		
//		int[]a= {1,3,2,6,5};
//		for(int i=0;i<a.length;i++)
//		{
//			set.add(a[i]);
//		}
//		
//    System.out.println(set);
//		
	}

}
