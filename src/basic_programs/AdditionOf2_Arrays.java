package basic_programs;

public class AdditionOf2_Arrays {

	public static void main(String[] args) {

		int[] a= {0,5,1,2,0,2};
		int[] b= {3,4,5,1};
		
		int length=a.length;
		
		if(a.length<b.length)  // To Store greatest length
		{
			length=b.length;
		}
		
		
		for(int i=0;i<length;i++)  //try catch bcz arrayIndexBoundsOfException will come
		{
			try {
				System.out.print(a[i]+b[i]+" ");

			} catch (Exception e) {
				if(a.length>b.length)
					System.out.print(a[i]+" ");
				
				else
					System.out.print(b[i]+" ");
			}
			
			
		}
			}
}
