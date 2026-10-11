package strings;

import java.util.HashMap;
import java.util.Map;

public class Code_12_AnagramsUsingMaps {
    private static boolean areAnagrams(String str1, String str2) {
        final int n1 = str1.length();
        final int n2 = str2.length();
        if(n1!=n2) {
            return false;
        }
        Map<Character, Integer> myMap1 = new HashMap<>();
        Map<Character, Integer> myMap2 = new HashMap<>();

        for(int i=0; i<n1; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if(myMap1.containsKey(char1)) {
                myMap1.put(char1, myMap1.get(char1)+1);
            } else {
                myMap1.put(char1, 1);
            }

            if(myMap2.containsKey(char2)) {
                myMap2.put(char2, myMap2.get(char2)+1);
            } else {
                myMap2.put(char2, 1);
            }
        }

        return myMap1.equals(myMap2);
    }

    public static void main(String[] args) {
        final String input1 = "listen";
        final String input2 = "silennt";
        final boolean output = areAnagrams(input1, input2);
        System.out.println(output);
    }
    
}
