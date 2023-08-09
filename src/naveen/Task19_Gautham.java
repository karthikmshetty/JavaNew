package naveen;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task19_Gautham {

	//find the vowels
	public static void main(String[] args)
	{

		String input="bangalore";
		String []str=input.split("");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		String vowels="aeiou";
		
		for(int i=0;i<str.length;i++)
		{
			   if(vowels.contains(str[i]))
				map.put(str[i],map.getOrDefault(str[i],0)+1);
		}
		
		System.out.println(map);	
		
	}

}
