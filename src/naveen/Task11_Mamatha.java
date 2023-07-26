package naveen;

import java.util.HashSet;

public class Task11_Mamatha {

	//To find the common element in arrays
	
	public static void main(String[] args) {

		int a[]= {1,2,8,8,3,4,5};
		int b[]= {8,3,5,5,9,20,8,11};
		
		HashSet<Integer> set1 = new HashSet<Integer>(); //to avoid duplicates in the same arrays
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for(int i:a)         
			set1.add(i);
		
		for(int i:b)
		{
			if(set1.contains(i)) 
				set2.add(i); //To avoid dup common element we used again set 
		}
		
		System.out.println(set2);			
	}

}
