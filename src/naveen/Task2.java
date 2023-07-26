package naveen;

public class Task2 {

	public static void main(String[] args) {
		
		int k=1;
		int count=0;
		while(true)
		{
			
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i+j>3)
				{
					if(k>=1&&k<=9)
					System.out.print(k+++"  ");
					
					else
						System.out.print(k+++" ");
						}
				else
					System.out.print("   ");
				}
			System.out.println();
			
			if(i==3)
				break;
		}
		count++;
		if(count==3)
			break;
		
		}
		
				
}
}