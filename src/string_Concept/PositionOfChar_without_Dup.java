package string_Concept;

import java.util.LinkedHashSet;

public class PositionOfChar_without_Dup {

	public static void main(String[] args) {
			
	String s = "Tester";
        String s1 = s.toLowerCase();

        Map<Character, Integer> charPositionMap = new LinkedHashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            charPositionMap.putIfAbsent(s1.charAt(i), i);
        }

        charPositionMap.forEach((ch, pos) -> System.out.println(ch + " is present in position of " + pos));
		
		
	}

}
