package string_Concept;

public class RemoveSpacesInString2 {

	public static void main(String[] args) {

		String input="I am a      software    engg";		
		String[] s1 = input.split("\\s+"); // To split if more than one space also
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");  // remove ln from sop
		}
		
		
	}

}
