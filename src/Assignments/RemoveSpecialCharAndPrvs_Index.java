package Assignments;

public class RemoveSpecialCharAndPrvs_Index {

	public static void main(String[] args) {

 
		
     String input = "Hello!@#Laxmii%^&";
     
     StringBuilder sb=new StringBuilder(input);

     for (int j = 0; j < sb.length(); j++) {

	int flag=0;
     for (int i = 0; i < sb.length(); i++) {
         char c = sb.charAt(i);

         if (!(Character.isLetterOrDigit(c) || Character.isWhitespace(c))) {
            
         	sb.deleteCharAt(--i);
         	sb.deleteCharAt(i);
      flag=1;
         	
         } 
         if(flag==1)
        	 break;
            
             }
     continue;

     
     }
     
	System.out.println(sb);
	
	}
	        

	    }

	


