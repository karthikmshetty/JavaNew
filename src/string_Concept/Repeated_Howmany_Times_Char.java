package string_Concept;

import java.util.LinkedHashSet;

public class Repeated_Howmany_Times_Char {

	public static void main(String[] args) {

		String s = "Tester";
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		//System.out.println(set);

		
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				
				if(ch==s1.charAt(i))
				{ 
					count++;
				}
			}
		
			System.out.println(ch+" = "+count);
			
	}
		
		
		
//		String s = "Tester";
//		String s1 = s.toLowerCase();
//		char[] s2 = s1.toCharArray();
//		
//		for(char i='a';i<='z';i++)
//		{
//			int count=0;
//			
//			for(char str:s2)
//			{
//				if(i==str)
//					count++;
//			}
//			if(count>0)
//				System.out.println(i+" present "+count);
//			
//		}
		
	}

}
