package string_Concept;

public class Merge_ZIGZAG_Array2 {

	public static void main(String[] args) {

		int []a= {1,2,3};
		int []b= {4,5,6,10};  //1 4 2 5 3 6 10
		int j=0,k=0,i=0;
		
		int []c=new int[a.length+b.length];
		
		while(i<c.length)
		{
			try {
				c[i]=a[j++];
				i++;
				c[i]=b[k++];
				i++;
					
			} 
			catch (Exception e) {
				if(j<a.length)
					c[i++]=a[j++];
				
				if(k<b.length)
					c[i++]=b[k++];
				}
		}
		
	for(int arr:c)
	{
		System.out.println(arr+" ");
	}
	}
		
	
	}


