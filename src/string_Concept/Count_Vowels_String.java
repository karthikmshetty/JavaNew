package string_Concept;

public class Count_Vowels_String {

	public static void main(String[] args) {

		String input="bangalore";
		char[] a=input.toCharArray();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
					{
				count++;
				System.out.print(a[i]);
				}
			
		}
		System.out.print("="+count);
	}

}
