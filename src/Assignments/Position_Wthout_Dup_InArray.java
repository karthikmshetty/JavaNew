package Assignments;

import java.util.LinkedHashSet;

public class Position_Wthout_Dup_InArray {

	public static void main(String[] args) {

		int [] a= {5,3,1,1,4,5,6};

		 LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 
		 for(int i=0;i<a.length;i++)
		 {
			 set.add(a[i]);
			  }
		 
		 for(int value:set)
		 {
		 for(int i=0;i<a.length;i++)
		 {
			 if(value==a[i])
			 {
			 System.out.println(value+" has position of "+i);
			 break;
			 }
		 }
		 }
	}

}
