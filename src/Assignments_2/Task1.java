package Assignments_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

import collections.Arraylist;

public class Task1 {

	public static void main(String[] args)
	{
	
		String input="ki ht rakmaih";
		String s[]=input.split("\\s+");
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)!=' ')
				rev+=input.charAt(i);	
		}
		
		int position=0;
		String result="";

		for(int i=0;i<s.length;i++)
		{
			int len=s[i].length();
			
			result+=rev.subSequence(position, len+position)+" ";
			position=position+len;
			
		}
		System.out.println(result);
		
		
		
				
	}
}
