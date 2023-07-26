package string_Concept;

import java.util.LinkedHashSet;

public class PositionOfChar_without_Dup {

	public static void main(String[] args) {
		String s = "Tester";
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
			}
		
		for(char ch:set)
		{
			
			for(int i=0;i<s1.length();i++)
			{
				
				if(ch==s1.charAt(i))
				{
					System.out.println(ch+" is present in position of "+i);
					break;
				}
				
			}
			
			
		}
		
		
	}

}
