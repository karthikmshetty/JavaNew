package string_Concept;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDup_Words_String {

	public static void main(String[] args) {

		
		String input="I am a I am a software Engg";
		String[] s=input.split("\\s+");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			}
		System.out.println(set);
		
		
		
		
	}

}
