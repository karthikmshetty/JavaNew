package naveen;

public class Task17_jancy {

	
	public static void main(String[] args) {

		String input="helloworld";
		char ch[]=input.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			char count=48;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=count;
				}
				}
		}
		
		for(char char1:ch)
			System.out.print(char1);
		
	}

}
