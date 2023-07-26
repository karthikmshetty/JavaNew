package Map_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Remove_Dup_Array {
	
	public static void main(String[] args)
	{
		String s="abcdabd";

		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			
			map.put(s.charAt(i),i);
}
		
		for(Entry<Character, Integer> m:map.entrySet())
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
				{
				count++;	
				}
					
			}
			if(count==1)
			System.out.println(m.getKey()+" is repeated "+count+" times");
		}
		
	
	}


}
