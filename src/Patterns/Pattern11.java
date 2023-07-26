package Patterns;

public class Pattern11 {

	public static void main(String[] args) {

			
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
			System.out.print(" ");
			}
			int k=5;
			for(int j=1;j<=i;j++)
			{
			System.out.print(k--+" ");
		}
			
		System.out.println();	
		}
	}

}
