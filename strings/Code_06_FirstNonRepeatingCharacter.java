package strings;

import java.util.HashMap;
import java.util.Map;

public class Code_06_FirstNonRepeatingCharacter {
    private static char getFirstNonRepeatingCharacter(String str) {
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

        for(char key: myMap.keySet()) {
            int value = myMap.get(key);
            if(value==1) {
                return key;
            } else {
                continue;
            }
        }
        
        return ' ';
    }

    public static void main(String[] args) {
        final String input = "swiss";
        final char output = getFirstNonRepeatingCharacter(input);
        System.out.println(output);
    }
}
