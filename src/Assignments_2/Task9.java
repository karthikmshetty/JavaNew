package Assignments_2;

public class Task9 {

	public static void main(String[] args) 
	{

		String input="am in ooty";
		String []s=input.split("\\s+");
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=s[i].length()-1;j>=0;j--)
			{
				System.out.print(s[i].charAt(j));
				
			}
		System.out.print(" ");
		}	
	}
}
