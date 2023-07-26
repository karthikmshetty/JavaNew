package Assignments_2;

public class Task5 {

	//input: i am selenium     o/p : m ui nelesmai
	public static void main(String[] args)
	{
		String input="i am selenium";
		String []s=input.split("\\s+");
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)!=' ')
				rev+=input.charAt(i);
		}

	String result="";
	int position=0;
		for(int i=0;i<s.length;i++)
		{
			int len=s[i].length();
			result+=rev.subSequence(position,len+position)+" ";
			position+=len;
			
		}
		
		System.out.println(result);
		
	}

}
