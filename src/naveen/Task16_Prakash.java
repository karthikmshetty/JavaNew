package naveen;

public class Task16_Prakash {

	public static void main(String[] args) {

		String input="india";
		
		for(int i=0;i<input.length();i++)
		{
			int n=0;
			for(int j=0;j<input.length();j++)
			{
				if(i+j>=input.length()-1)
				{
					System.out.print(input.charAt(n));
					n++;

				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}

}
