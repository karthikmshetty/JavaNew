package Assignments_2;

import java.util.Arrays;
//Anagram number 

public class Task10 {

	public static void main(String[] args) 
	{
		String a="CAT";
		String b="ACT";
		
		char []ch1=a.toCharArray();
		char []ch2=b.toCharArray();
		

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean res=Arrays.equals(ch1,ch2);
		if(res)
		{
			System.out.println(" Yes its AAGRAM ");
		}
		else
			System.out.println(" Its not an ANAGRAM ");
		
	}
}
