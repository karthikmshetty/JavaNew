package string_Concept;

public class RemoveDup_wthout_Collection {

	public static void main(String[] args) {

	        String input = "wwwpreethwp";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in sb
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // Append if not a duplicate
            if (!isDuplicate) {
                sb.append(currentChar);
            }
        }

        System.out.println("After removing duplicates: " + sb.toString());
		
	}

}
