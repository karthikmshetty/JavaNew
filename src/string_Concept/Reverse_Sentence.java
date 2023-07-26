package string_Concept;

public class Reverse_Sentence {

	public static void main(String[] args) {

		String input = "I am a software engg";
		String[] s = input.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}

	}

}
