package basic_programs;

import java.util.Iterator;

public class CombinationOfNos {

	//when you add two combination of array result should be 11
	public static void main(String[] args) {

		int[] a= {1,3,8,2,9,4};
		
		for(int i=0;i<a.length;i++)
		{
			try {
			if(a[i]+a[i+1]==11)
			{
				System.out.println("combination nmbrs are "+a[i]+" "+a[i+1]);
				}
			}
			catch(Exception e)
			{
				continue;
			}
		}
		
		
		
		
		
	}

}
