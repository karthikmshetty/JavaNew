package Assignments_2;

public class Task13 {

	public static void main(String[] args)
	{

		String input="so123sso10s";
		int rem=0,prod=1;
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
		if(Character.isDigit(input.charAt(i)))
		{
			int num=Character.getNumericValue(input.charAt(i));
		 sum=sum*10+num;
		}
		
		else
		{
			if(sum!=0)
			{
			prod*=sum;
			
			sum=0;}
		
		}		
		}
		System.out.println(prod);

	}
}


