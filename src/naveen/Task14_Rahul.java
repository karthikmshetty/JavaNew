package naveen;

import java.util.HashSet;

public class Task14_Rahul {
 
	//remove duplicates from array in optimized way
	public static void main(String[] args) 
	{
		int a[]= {9,1,3,2,5,2,6,5,1,9,7};
		
		HashSet<Integer> set = new HashSet();
		HashSet<Integer> set1 = new HashSet();

		for(int arr:a)
		{
			if(set.add(arr)==false)
             set1.add(arr);	
			}	
		
		System.out.println(set1);
	}

}
