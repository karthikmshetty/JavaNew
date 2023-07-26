package basic_programs;

public class First_min_nmbr {
//first min number in array using buble sort
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
		System.out.println("First Min number -->"+a[0]);
		System.out.println("First max number-->"+a[a.length-1]);
		
		
		//sum of first 3 min num
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
			}
		System.out.println("Sum of First min 3 number-->"+sum);
		
		
		//sum of first 3 max number
		int sum1=0;
		for(int i=a.length-1;i>=a.length-3;i--)
		{
			sum1 +=a[i];
		}
		System.out.println("Sum of First max 3 number-->"+sum1);

		
		//mul of first 3 min number
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul *=a[i];
		}
		System.out.println("Multiplication of First min 3 number-->"+mul);

		
		
}}
