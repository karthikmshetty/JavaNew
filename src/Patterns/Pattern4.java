package Patterns;

public class Pattern4 {

	public static void main(String[] args) {

//		     *
//	      *  *
//	   *  *  *
//   * *  *  *
// * * *  *  *
//	
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("  "); // we need to give two space, bcz in printing star im giving space so i need 
				                        // to give two space otherwise star will shift towards right side and will 
				                        // become triangle
			}
			
			for(int k=1;k<=i;k++)
			{
			System.out.print("* ");
			}
	
			System.out.println();

		}
		


	}

}
