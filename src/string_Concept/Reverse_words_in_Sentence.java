package string_Concept;

public class Reverse_words_in_Sentence {

	public static void main(String[] args) {

		String input = "I am a software engg";
		String [] s=input.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=s[i].length()-1;j>=0;j--)
			{
				System.out.print(s[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
