package strings;

import java.util.HashMap;
import java.util.Map;

public class Code_07_HighestFrequencyCharacter {
    private static char getHighestFrequencyCharacter(String str) {
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

        int largestValue = -999999999;
        for(char key: myMap.keySet()) {
            int value = myMap.get(key);
            if(value > largestValue) {
                largestValue = value;
            }
        }

        for(char key: myMap.keySet()) {
            int value = myMap.get(key);
            if(value == largestValue) {
                return key;
            }
        }

        return '0';
    }

    public static void main(String[] args) {
        final String input = "banana";
        final char output = getHighestFrequencyCharacter(input);
        System.out.println(output);
    }
}
