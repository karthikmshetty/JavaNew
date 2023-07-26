package basic_programs;

public class PalindromeNum {

	public static void main(String[] args) {

		int num=121;
		int temp=num;
		int sum=0,rem=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
			}
		if(temp==sum)
			System.out.println(temp+" is a palindrome number");
		else
			System.err.println(temp+" is not a palindrome number");
	}

}
