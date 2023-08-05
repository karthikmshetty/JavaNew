package naveen;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Generate Password  

public class Task7 {

	public static void main(String[] args) 
	{
	   String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	   String upperCase= lowerCase.toUpperCase();
	   String digits = "0123456789";
	   String specialChars = "!@#$%^&*()_-+=<>?";	
	   int len=10,count=0;
	   String output="";
	  
	   Random ran = new Random();
	   
	   while(count++<10)
	   {
	   ArrayList<Character> list = new ArrayList();
	   list.add(generatePassword(lowerCase,ran));
	   list.add(generatePassword(upperCase,ran));
	   list.add(generatePassword(digits,ran));
	   list.add(generatePassword(specialChars,ran));
	   
	   String allChar=lowerCase+upperCase+digits+specialChars;
	   for(int i=5;i<=len;i++)
	   {
		   list.add(generatePassword(allChar,ran));
	   }
	   
        // Shuffle the password characters
	   Collections.shuffle(list);
	   
	   //build the final password
	   for(char c:list)
	   {
		   output+=c;     //we can print list directly but the o/p will be surrounded with [ ]
	   }
	   
	   System.out.println(output);
	   output="";

	   }    
		
	}
	
	//To generate password randomly according to given set of string values
	public static char generatePassword(String value,Random ran)
	{
		int ranNum=ran.nextInt(value.length());
		return value.charAt(ranNum);
		
	}	    

}
