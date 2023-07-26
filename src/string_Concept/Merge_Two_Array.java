package string_Concept;

public class Merge_Two_Array {

	public static void main(String[] args) {

		int []a= {1,2,3};
		int []b= {4,5,6};
		
		
		int []c=new int[a.length+b.length];
		int n=0,j=0;
		int len=a.length;
		
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			c[n++]=a[i];
			
			if(i<b.length) {
				c[len++]=b[i];
			}
		}
		
		
		for(int i=0;i<len;i++)
		{
			System.out.println(c[i]);
		}

		
	}

}
