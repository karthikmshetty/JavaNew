package string_Concept;

import java.util.Scanner;

public class StringPalindrome_2 {

	public static void main(String[] args) {

		for(;;)  // for infinite loop , if we need
		{
		
		System.out.println("Enter a String ");
		Scanner sc = new Scanner(System.in);
		String input=sc.next();
		String output="";
		
		
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		
		if(input.equals(output)) 
			System.out.println(input+" is a Palindrome");
		else
			System.out.println(input+" is not a Palindrome");
		
		}
	}
}
