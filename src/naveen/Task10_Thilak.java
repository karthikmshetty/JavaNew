package naveen;

import java.util.Arrays;

public class Task10_Thilak {

	public static void main(String[] args) {

		String input="abc123abd983";
		String []num=input.split("[^\\d]+");
		String []alpha=input.split("\\d+");
		String output="";
		
		//System.out.println(Arrays.toString(num));
		//System.out.println(Arrays.toString(alpha));
		
		for(int i=0;i<alpha.length;i++)
		{
			for(int j=0;j<alpha[i].length();j++)
			{
				
				output+=alpha[i].charAt(j);
			}
			
			for(int k=num[i+1].length()-1;k>=0;k--)
			{
				output+=num[i+1].charAt(k);
				
			}	
		}
		
		System.out.println(output);

		
		
		
	}

}
