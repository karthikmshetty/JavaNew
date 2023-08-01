package naveen;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Task15_Anitha_Map {

	public static void main(String[] args)
	{

		int a[]= {1,2,3,2,4,5,6,2,3};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],map.getOrDefault(a[i],0)+1);
		}
		
		for(Entry<Integer,Integer>m:map.entrySet())
		{
			if(m.getValue()>1)
				System.out.println(m.getKey());		
		}
	}

}
