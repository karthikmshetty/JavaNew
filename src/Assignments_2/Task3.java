package Assignments_2;

public class Task3 {

	//reverse the words in a sentence
	public static void main(String[] args)
	{
   String input="software test engineer";
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
