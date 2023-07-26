package string_Concept;

public class FindMaxLengthIndexFrom_Array {

	public static void main(String[] args) {
String [] s= {"ab","bcde","hbcv","ec"};
		
		String max_len=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max_len.length()) //comparing string value of array so legth()
			{
				max_len=s[i];
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max_len.length())
			{
				System.out.println(s[i]+" "+i);
			}
		}
		
		
	}

}
