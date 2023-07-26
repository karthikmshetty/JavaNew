package string_Concept;

public class ReverseString {

	public static void main(String[] args) {

		//1
		String input="Karthi";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		
		System.out.println(output);
			
		
		//2
		StringBuilder sb = new StringBuilder("Test");
	    System.out.println(sb.reverse());
	   
	   //3
	   String s="Software";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   System.out.print(s.charAt(i));
	   }
		}
	
	

}
