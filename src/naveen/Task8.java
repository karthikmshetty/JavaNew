package naveen;

public class Task8 {

	public static void main(String[] args)
	{
		String input="a2b3c1d1";
		char[] ch=input.toCharArray();

		for(int i=1;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				int count=Character.getNumericValue(ch[i]);
				for(int j=0;j<count;j++)
				{
					System.out.print(ch[i-1]);
				}
			}
			
		}
	}

}
