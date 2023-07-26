package Assignments_2;

public class Task12 {

	public static void main(String[] args) 
	{
String input="INDIA";
   char[] ch = input.toCharArray();
   char temp;
  int  key=2;
  
  
  while(key-->0)
  {
	  try
	  {
	  for(int i=0;i<ch.length;i++)
	  {
		  temp=ch[i];
		  ch[i]=ch[i+1];
		  ch[i+1]=temp;
	  }}
	  catch(Exception e)
	  {}

	  
  }
  
for(char arr:ch)
{
	System.out.print(arr);}

  
	}

}
