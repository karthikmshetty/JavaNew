package basic_programs;

public class PrimeNum {

	public static void main(String[] args) {

		int num=7;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
			}
		
		if(count==2)
		System.out.println(num+" is Prime number");		
		
		else
			System.err.println(num+" is not a prime number");
	}

}
