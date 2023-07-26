package basic_programs;

public class FirstAndSecondMin_wtht_BBSort {

	public static void main(String[] args) {
int []a= {0,3,4,0};

	int min1=a[0];
	int min2=a[1];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min1)
		{
			min1=a[i];
		}
		
	}
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min2&&a[i]!=min1)
		{
			min2=a[i];
		}
		
	}
	
	System.out.println("First two min nmbr-->"+min1+" "+min2);
	
	// for first and second max number
	int max1=a[0];
	int max2=a[0];
	
for(int i=0;i<a.length;i++)
{
if(a[i]>max1)
	max1=a[i];
}

	
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>max2&&a[i]!=max1)	
		max2=a[i];
	}
	
	System.out.println("First two max nmbr-->"+max1+" "+max2);

	
	}
	


}
