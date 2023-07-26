package Assignments;

import java.util.LinkedHashSet;

public class Occurance_InArray {

	public static void main(String[] args) {

		int [] a= {5,3,1,1,4,5,6};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(int value:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(value==a[i])
				{
					count++;
				}
			}
				System.out.println(value+" is occured "+count+" times");

		}

	}

}
