package string_Concept;

public class FindSumOf2Digits {

	public static void main(String[] args) {

		
		String s="a11b13d1"; //11+12
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))) //0=48
			{
				int n=Character.getNumericValue(s.charAt(i));
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
	}
		System.out.println(sum);


}}
