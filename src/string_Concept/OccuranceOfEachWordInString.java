package string_Concept;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {

		String input="I am a I am a software Engg";
		String[] s=input.split("\\s+");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			}
		
		for(String str:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				
					if(str.equals(s[i]))
					{
						count++;
					}		
				}
			
			System.out.println(str+" is occured "+count+" times");
		}
		
		
		
		
	}

}
