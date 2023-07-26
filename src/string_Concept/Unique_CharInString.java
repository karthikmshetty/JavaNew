package string_Concept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Unique_CharInString {

	public static void main(String[] args) {

		String s = "Tester";
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		System.out.println(set);

		//NOTE: LinkedHashSet bcz it will maintain order of insertion
	}

}
