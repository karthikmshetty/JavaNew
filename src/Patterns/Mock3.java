package Patterns;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Mock3 {

	public static void main(String[] args) {

		String input=" i am i am tester";
		String []s=input.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap();
		
		for(int i=0;i<s.length;i++)
		{
			map.put(s[i],i);
		}
		
		for(Entry<String, Integer> m:map.entrySet())
		{
			System.out.print(m.getKey()+" ");
		}
		
	}

}
