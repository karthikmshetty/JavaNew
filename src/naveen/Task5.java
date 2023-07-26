package naveen;

public class Task5 {

	public static void main(String[] args)
	{

		int a[]= {10,20,2,2,30,25};
		int x=54;
		int sum=0;
		int min=Integer.MAX_VALUE;
		int num1=0,num2=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int n=0;
				sum=a[i]+a[j];
				if(sum>x)
				  n=sum-x;
				else
					n=x-sum;
					
				if(n<min)
				{
					min=n;
					num1=a[i];
					num2=a[j];
				}		
			}
		}
		
		System.out.println("Result : "+num1+" "+num2);
		
		
		
	}

}
