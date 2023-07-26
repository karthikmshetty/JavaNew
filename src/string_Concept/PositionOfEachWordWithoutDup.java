package string_Concept;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithoutDup {

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
			for(int i=0;i<s.length;i++)
			{
				
				if(str.equals(s[i]))
				{
					System.out.println("The position of  "+s[i]+" is "+i);
					break;  //without break it will give all value
				}
			}
			
		}
		
	}

}
