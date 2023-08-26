package naveen;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task_23_Map_demonstrate {

	public static void main(String[] args) {

		//map demostration

		
		//NOTE: getKey(), getValue() coming when we iterate through entrySet()	
			
			System.out.println("First Approach ");
			
			Map<Integer,String> map=new LinkedHashMap<Integer,String>();	
			
			map.put(1,"A");
			map.put(2,"B");
			map.put(3,"C");
			map.put(4,"D");
			map.put(5,"E");
			
		//Approach No=1
			for( int key:map.keySet())  //keySet() will return entire key set 
			{
			
				System.out.print(key+" ");
				System.out.println(map.get(key)); // To print value of the key , use map.get() and pass key
			}

			
			System.out.println();
			System.out.println("Second approach ");
			
			//Approach No=2
			
			for(Entry<Integer,String> map1:map.entrySet())
			{
				System.out.println(map1.getKey()+" "+map1.getValue());
			}
			
			
			

	}

}
