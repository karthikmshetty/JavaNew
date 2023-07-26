package Map_;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Position_Wtht_Dup {

	public static void main(String[] args) {

		String s="abcdabd";
		LinkedHashMap<Character,Integer> map = new LinkedHashMap();

		for(int i=0;i<s.length();i++)
		{
		     map.put(s.charAt(i),i);	

		}
		for (Entry<Character, Integer> m:map.entrySet()) {
			
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
				{
					System.out.println(m.getKey()+" has position of "+i);
					break;

				}
			}
		}

	}

}
