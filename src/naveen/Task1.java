package naveen;

public class Task1 {

	public static void main(String[] args) {
   String input="india";
   int count=0;
   while(true)
   {
	   for(int i=0;i<=count;i++)
	   {
	   System.out.print(input.charAt(i));
	   }
	   count++;
	   System.out.println();
   
   if(count==input.length())
	   break;
   
   }


	}

}
