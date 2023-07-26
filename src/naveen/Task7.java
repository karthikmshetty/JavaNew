package naveen;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Generate Password  

public class Task7 {

	    private static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	    private static final String upperCase= lowerCase.toUpperCase();
	    private static final String digits = "0123456789";
	    private static final String specialChars = "!@#$%^&*()_-+=<>?";

	    public static void main(String[] args) {
	        int length = 10; // Desired password length
	        int n=1;
 	        String output="";

	        while(n++<10)
	        {
	        	 Random random = new Random();
	 	        List<Character> passwordCharacters = new ArrayList<>();

	 	        passwordCharacters.add(getRandomCharacter(lowerCase, random));
	 	        passwordCharacters.add(getRandomCharacter(upperCase, random));
	 	        passwordCharacters.add(getRandomCharacter(digits, random));
	 	        passwordCharacters.add(getRandomCharacter(specialChars, random));

	 	        // Fill the remaining length with random characters
	 	        for (int i = 4; i < length; i++) {
	 	            String allChars = lowerCase + upperCase + digits + specialChars;
	 	            passwordCharacters.add(getRandomCharacter(allChars, random));
	 	        }

	 	        // Shuffle the password characters
	 	        Collections.shuffle(passwordCharacters);

	 	        // Build the final password string
	 	       for (char c : passwordCharacters) {
	 	            output+=c;
	        }
		        System.out.println("Generated Password:  " + output);
		        output="";
   
	        }
    
	    }

	    private static char getRandomCharacter(String characterSet, Random random) {
	        int randomIndex = random.nextInt(characterSet.length());
	        return characterSet.charAt(randomIndex);
	    }
}
