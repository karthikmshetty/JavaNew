package Assignments_2;

public class Task7 {

	//buble sort
	public static void main(String[] args) 
	{
     int a[]= {5,2,3,5,6,4};
     int temp;
     
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a.length-1-i;j++)
    	 {
    		 if(a[j]>a[j+1])
    		 {
    			 temp=a[j];
    			 a[j]=a[j+1];
    			 a[j+1]=temp;
    		 }
    		 
    	 }
     }
		for(int arr:a)
			System.out.println(arr);
     
     
	}

}
