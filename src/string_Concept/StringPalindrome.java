package string_Concept;

public class StringPalindrome {

	public static void main(String[] args) {

		String input="malayalam";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		
		if(input.equals(output)) 
			System.out.println(input+" is a Palindrome");
		else
			System.out.println(input+" is not a Palindrome");
		
	//NOTE : instead of equals() method if u use == it will compare adress not value	
	
	
	
	}

}
