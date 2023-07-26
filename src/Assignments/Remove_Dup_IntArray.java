package Assignments;

import java.util.LinkedHashSet;

public class Remove_Dup_IntArray {

	public static void main(String[] args) {

		int [] a= {5,3,1,1,4,5,6};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		System.out.println("Unique values of array");
		for(int value:set)
		{
			System.out.print(value+" ");
		}
		
	}

}
