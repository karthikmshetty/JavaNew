package string_Concept;

import java.util.LinkedHashSet;

public class CountDupChar_String {

	public static void main(String[] args) {

		String s = "Tester";
		String s1 = s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		//System.out.println(set);

		
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				
				if(ch==s1.charAt(i))
				{ 
					count++;
				}
			}
			if(count>1)
			System.out.println(ch+" is repeated "+count+" times");
			
		}
	}

	   //  public static void main(String[] args) {
    //     String s = "Tester";
    //     String s1 = s.toLowerCase();
    //     Map<Character, Integer> charCountMap = new HashMap<>();

    //     // Count character occurrences
    //     for (char ch : s1.toCharArray()) {
    //         charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
    //     }

    //     // Print only duplicate characters
    //     for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
    //         if (entry.getValue() > 1) {
    //             System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times");
    //         }
    //     }
    // }
}
