package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code_05_SortString {
    private static String getSortedString(String str) {
        final int n = str.length();
        List<Character> chrList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            chrList.add(str.charAt(i));
        }
        
        Collections.sort(chrList);

        StringBuilder strBldr = new StringBuilder();
        for(char ch: chrList) {
            strBldr.append(ch);
        }

        return strBldr.toString();
    }

    public static void main(String[] args) {
        final String input = "dcab";
        final String output = getSortedString(input);
        System.out.println(output);
    }
}
