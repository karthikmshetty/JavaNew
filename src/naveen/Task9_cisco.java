package naveen;
import java.util.Arrays;

public class Task9_cisco {

	public static void main(String[] args) 
	{
String input="cisco is best company IN india";
String []a=input.split("\\s+");

for(int i=0;i<a.length;i++)
{
		if(a[i].equalsIgnoreCase("in"))
		{
			a[i]="at";
			System.out.print(a[i]+" ");
		}
		else
			System.out.print(a[i]+" ");
}

	//another code for split by alphabetic
//		String s="ewd12nsh3fjhf7nf4";
//		String[]arr=s.split("[^\\d]+");
//		System.out.println(Arrays.toString(arr));
//		int[]in=new int[arr.length];
//		int multi=1;
//		for(int i=1;i<arr.length;i++)
//		{
//			in[i]=Integer.parseInt(String.valueOf(arr[i]));
//			multi=multi*in[i];
//			System.out.print(in[i]+"*");
//		}
//		System.out.print("="+multi);
	}

}
