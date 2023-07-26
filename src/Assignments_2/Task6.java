package Assignments_2;

public class Task6 {

	public static void main(String[] args) 
	{
		int a=10,b=0,c;
		
		try {
			c=a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
	}
		finally
		{
			System.out.println("deviser cant be a 0 ");
		}

		
	}

}
