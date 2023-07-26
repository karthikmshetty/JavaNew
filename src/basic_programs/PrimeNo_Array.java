package basic_programs;

public class PrimeNo_Array {

	public static void main(String[] args) {

		
		int []a= {3,4,5,8,6,7};
		
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;

			int num=a[i];
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
				}
			if(count==2)
			System.out.println(a[i]+" is a prime number in this array");
		}
		
		
	}

}
