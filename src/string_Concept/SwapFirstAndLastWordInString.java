package string_Concept;

public class SwapFirstAndLastWordInString {

	public static void main(String[] args) {

		
		String input = "I am a software engg";
		String[] s = input.split(" ");
		
		//s[0]=I  s[4]=engg
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
			
		
		
			}

}
