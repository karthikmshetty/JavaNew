package Assignments_2;

public class Task1 {

	public static void main(String[] args) {

		
		String input="welcome to expleo";
		String []s=input.split("\\s+");
		
		for(int i=s.length-1;i>=0;i--)
		{
System.out.print(s[i]+" ");			
		}
		
		
	}

}
