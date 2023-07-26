package Assignments;

public class ReverseWord {

	public static void main(String[] args) {

		// r ee n ignEeraw tfosamaI

		String input = "I am a Software Engineer";
		String[] s = input.split("\\s+");

		String rev = "";
		
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) != ' ')
				rev += input.charAt(i);
		}
		String result = "";
		int position = 0;
		
		for(int i=0;i<s.length;i++)
		{
			int len=s[i].length(); // here inside the array string is there so we use length()
			result=result+rev.subSequence(position, position+len)+" ";
			position=position+len;
			
			//System.out.println(result);
	}
		
		System.out.println(result);

	}
}
