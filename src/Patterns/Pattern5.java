package Patterns;

public class Pattern5 {

	public static void main(String[] args) {

		//Triangle
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>5)
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=i;j<=5;j++)
//			{
//				System.out.print(" ");  //here give only one space
//			}
//			
//			for(int k=1;k<=i;k++)
//			{
//			System.out.print("* ");
//			}
//	
//			System.out.println();
//
//}
	}

}
