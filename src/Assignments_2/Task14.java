package Assignments_2;

public class Task14 {

	public static void main(String[] args) 
	{
		
	        String input = "a2b1c3";
	        String decodedString = decodeString(input);
	        System.out.println(decodedString); // Output: aabccc
	    }

	    public static String decodeString(String input) {
	        StringBuilder decodedString = new StringBuilder();
	        int index = 0;
	        
	        while (index < input.length()) {
	            char currentChar = input.charAt(index++);
	            
	            if (index < input.length()) {
	                int count = Character.getNumericValue(input.charAt(index));
	                for (int i = 0; i < count; i++) {
	                    decodedString.append(currentChar);
	                }
	                index++;
	            }
	        }
	        
	        return decodedString.toString();		
		
		

		
	}

}
