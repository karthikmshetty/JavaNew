package string_Concept;

public class MergeAray {

	
	public static void main(String[] args) {
		int[] a= {1,4,7,5};
		int[] b= {2,5,7,3,8};
		int[] c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
		
		for(int l:c)
		System.out.print(l+" ");
		
	}
}
