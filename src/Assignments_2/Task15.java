package Assignments_2;

public class Task15 {

	public static void main(String[] args) 
	{

		String input="himkjhighhikj";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='h'&&input.charAt(i+1)=='i')
			{
				count++;
			}
		}
		
		System.out.println("hi is repeated "+count);
	}

}
