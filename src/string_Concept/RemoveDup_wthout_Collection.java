package string_Concept;

public class RemoveDup_wthout_Collection {

	public static void main(String[] args) {

		String input="wwwpreethwp";

		char []ch=input.toCharArray();
		boolean []b=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
		if(!b[i])
		{
		char c=ch[i];
		
		for(int j=0;j<ch.length;j++)
		{
			if(c==ch[j])
			{
				b[j]=true;
			}
			
		}
			System.out.print(c);
			
		}
		
		}
		
	}

}
