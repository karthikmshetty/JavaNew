package string_Concept;

public class FindMinLengthIndexFrom_Array {

	public static void main(String[] args) {

		String [] s= {"ab","bcde","hbcv","ec"};
		
		String min_len=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min_len.length())
			{
				min_len=s[i];
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min_len.length())
			{
				System.out.println(s[i]+" "+i);
			}
		}
		
		
	}

}
