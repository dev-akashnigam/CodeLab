package strings;

import java.util.HashMap;
import java.util.Map;

public class Code_04_CountCharacterFrequencies {
    private static void printCharacterFrequencies(String str) {
        final int n = str.length();
        Map<Character, Integer> myMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if(myMap.containsKey(ch)) {
                myMap.put(ch, myMap.get(ch)+1);
            } else {
                myMap.put(ch, 1);
            }
        }

        System.out.println(myMap);
    }
    
    public static void main(String[] args) {
        final String input = "programming";
        printCharacterFrequencies(input);
    }
}
