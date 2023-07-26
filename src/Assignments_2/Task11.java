package Assignments_2;

public class Task11 {

	public static void main(String[] args) {

		//rotate the array
		
		int []a= {7,2,3,4,5};
		
		int key=50,temp;
		
		
		
		while(key-->0)
		{
			try
			{
			for(int i=0;i<a.length-1;i++)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}}
			catch(Exception e)
			{}

		}
				
		for(int arr:a)
		{
			System.out.println(arr);

		}
		
	}

}
