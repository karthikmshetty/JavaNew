package naveen;

import java.util.Arrays;

public class Task24_Sirions {

	public static void main(String[] args) {

		//convert given arrays to String
		
		String []s= {"abcd","xyz"};
		String output=String.join("", s);
		System.out.println(output);
		
		//vice versa
		String input="abcd";
		char[] ch=input.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
	}

}
