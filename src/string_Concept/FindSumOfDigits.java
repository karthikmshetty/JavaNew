package string_Concept;

public class FindSumOfDigits {

	public static void main(String[] args) {

		String s="a3b2d4"; // ans=9
		
		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48; //51-48=3
				sum=sum+n;
			}
			
			
			}
		System.out.println(sum);
	//ASCII
		/* 0 = 48
		   1 =49
		   2 =50
		   3 =51
		   4 =52
		   5 =53
		   6 =54
		   7 =55
		   8 =56
		   9 =57
		   */
	}

}
