package naveen;

import java.util.Arrays;

public class Task18_Anith {

	public static void main(String[] args) {

		String input="a::b@c!d";
		String []s=input.split("[^a-zA-Z0-9]+");
int len=s.length-1;

for(int i=0;i<input.length();i++)
{
	if(Character.isAlphabetic(input.charAt(i)))
	{
		System.out.print(s[len]);
		len--;
	}
	else
		System.out.print(input.charAt(i));
	}}

}
