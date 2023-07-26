package basic_programs;

public class PrimeNum_1To100 {

	public static void main(String[] args) {
        
		for(int i=1;i<=100;i++)
		{
			int count=0;

			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
				count++;
			}
		if(count==2)
		System.out.println(i+" is Prime number");		
		
		else
			System.out.println(i+" is not a prime number");
}

}}
