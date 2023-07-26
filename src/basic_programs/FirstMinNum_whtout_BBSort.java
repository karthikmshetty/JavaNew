package basic_programs;

public class FirstMinNum_whtout_BBSort {

	public static void main(String[] args) {

		int []a= {5,3,4,2,1};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Min nmbr is--> "+min);
		
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			}
		System.out.println("Max nmbr is-->"+max);
	}

}
