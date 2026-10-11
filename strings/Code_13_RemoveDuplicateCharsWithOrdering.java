package strings;

import java.util.HashSet;
import java.util.Set;

public class Code_13_RemoveDuplicateCharsWithOrdering {
    private static String removeDuplicateChars(String str) {
        final int n = str.length();
        String output = "";
        Set<Character> mySet = new HashSet<>();
        
        for(int i=0; i<n; i++) {
            if(mySet.contains(str.charAt(i))) {
                continue;
            } else {
                mySet.add(str.charAt(i));
                output += String.valueOf(str.charAt(i));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        final String input = "programming";
        final String output = removeDuplicateChars(input);
        System.out.println(output);
    }
    
}
