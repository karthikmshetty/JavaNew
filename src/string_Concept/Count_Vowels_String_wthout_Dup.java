package string_Concept;

import java.util.LinkedHashSet;

public class Count_Vowels_String_wthout_Dup {

	public static void main(String[] args) {

		
		String input1="Bangalore";
		String input=input1.toLowerCase();
		char[] a=input.toCharArray();
		int count=0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
					{
				set.add(a[i]);
				}
			}
	
	for(char ch:set)
	{
		count++;
		System.out.print(ch);

	}
	System.out.print("="+count);

}}
