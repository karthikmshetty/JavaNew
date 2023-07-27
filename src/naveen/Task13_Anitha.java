package naveen;

public class Task13_Anitha {

	public static void main(String[] args) {

		String s="india";
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" "); 
			}
			
			int count=s.length()-1;
			for(int k=1;k<=i;k++)
			{
			System.out.print(s.charAt(count) );
			count--;
			}
	count=0;
			System.out.println();

		}
		
	}

}
