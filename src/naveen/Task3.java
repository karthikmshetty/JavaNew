package naveen;

public class Task3 {

	public static void main(String[] args) {
				
		String input="wwwpreethwp";
		char []ch=input.toCharArray();
		boolean b[]=new boolean[input.length()];
		
		for(int i=0;i<ch.length;i++)
		{	
			if(!b[i])
			{
				char c=ch[i];
				int count=0;
				for(int j=i;j<ch.length;j++)
				{
					if(c==ch[j])
					{
						count++;
						b[j]=true;
					}
					
					else
						break;
				}				
			
				System.out.print(c+""+count+" ");
			}}		
    }     

}
