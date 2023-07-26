package Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrakashSir {

	public static void main(String[] args) {

		int[] a= {3,6,3,8,1,7,4,2,2,7,6,1,8};
		int j=0;
		LinkedHashMap<Integer,String> map = new LinkedHashMap();
		
		try {
		for(int i=0;i<a.length;i++)
		{
			
			if(a[j]+a[j+1]==9)
			{
				
				map.put(a[j],"");
				map.put(a[j+1],"");

			}
			j++;

			
		}
		}
		
		catch (Exception e) {
			System.out.println();
		}
		
for(Entry<Integer,String> map1:map.entrySet())	
{
	System.out.println(map1.getKey());}
		
	}

}
