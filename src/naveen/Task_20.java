package naveen;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Task_20 {

	//print duplicates using map
	public static void main(String[] args) 
	{
		
     String input="bangmangind";
     LinkedHashMap<Character,Integer> map=new LinkedHashMap();
  
     for(int i=0;i<input.length();i++)
     {
    	 map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
     }
     
     for(Entry<Character,Integer> ch:map.entrySet())
     {
    	 if(ch.getValue()>1)
    		 System.out.println(ch.getKey());
     }
     
		
	}

}
