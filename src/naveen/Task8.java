package naveen;

public class Task8 {

	public static void main(String[] args)
	{
		String input="a2b3c1d1";
		char ch[]=input.toCharArray();
		String output="";
		
		for(int i=1;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				int count=Character.getNumericValue(ch[i]);
				for(int j=0;j<count;j++)
				{
					output+=ch[i-1];
				}
				
			}
		}
		System.out.println(output);

	}

}
