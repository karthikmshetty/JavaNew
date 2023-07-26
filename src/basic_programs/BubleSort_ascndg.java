package basic_programs;

public class BubleSort_ascndg {

	public static void main(String[] args) {

		int []a= {5,3,4,1,2};
		int temp;
		for(int i=0;i<a.length;i++)  //number = iteration. 5 iteration happens for 5 element

		{
			for(int j=0;j<a.length-1-i;j++) //i used to avoid unwanted compare of digits which is already sorted.

			{
				if(a[j]>a[j+1])
				{
			    temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
				
			}
		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int arr:a)
		{
			System.out.println(arr);
		}
	}

}
