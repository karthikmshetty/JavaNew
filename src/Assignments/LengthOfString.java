package Assignments;

public class LengthOfString {

	public static void main(String[] args) {

		String input="I am a Tester ";
		int count=0;
		for(char ch:input.toCharArray())
		{
			count++;
		}
		System.out.println("Length of the String is "+count);
	}

}
