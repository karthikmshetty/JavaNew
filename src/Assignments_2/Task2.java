package Assignments_2;

public class Task2 {
//insert a String into middle of the array
	public static void main(String[] args) 
	{
		String input="from";
		String []s= {"karthik","Shetty","Mangalore","Karnataka"};
		
		String []s2=new String[s.length+1];
		int midLen=s2.length/2;
		
		int j=0;
		try
		{
		for(int i=0;i<=s2.length;i++)
		{
			    if(i==midLen)
			    {
				s2[j++]=input;
				s2[j++]=s[i];
			    }
			    
			    else
			    	s2[j++]=s[i];			
		}
		}
		catch(Exception e)
		{
			
		}
		
		for(String arr:s2)
		{
		System.out.println(arr);
		}
		

	}

}
