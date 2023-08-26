package naveen;

import java.util.Arrays;

public class Task21_Pradeep {

	public static void main(String[] args) 
	{

		String input="he8lt97pp";
		String []alpha=input.split("\\d+");
		String []num=input.split("\\D+");
		int n=1;
		
		try {
		for(int i=alpha.length-1;i>=0;i--)
		{
				StringBuilder sb = new StringBuilder(alpha[i]);
				System.out.print(sb.reverse()); 
				System.out.print(num[n]);
				n++;
}}
catch (Exception e) {
			
		}
		
	//one more approach
//		String input="he8lt9pp";
//		String rev="";
//		
//		for(int i=input.length()-1;i>=0;i--)
//		{
//			rev+=input.charAt(i);
//		}
//		
//		for(int i=0;i<input.length();i++)
//		{
//			if(Character.isAlphabetic(input.charAt(i)))
//				System.out.print(rev.charAt(i));
//			else
//				System.out.print(input.charAt(i));
//			}

		
	}

}
