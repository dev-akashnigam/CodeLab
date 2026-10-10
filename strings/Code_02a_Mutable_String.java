package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Code_02a_Mutable_String {
    private static char[] getMutableString(String str) {
        return str.toCharArray();
    }

    private static List<Character> getMutableString1(String str) {
        final int n = str.length();
        List<Character> chrList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            chrList.add(ch);
        }

        return chrList;
    }

    public static void main(String[] args) {
        final String input = "Hello";
        final char[] output = getMutableString(input);
        System.out.println(Arrays.toString(output));

        final List<Character> output1 = getMutableString1(input);
        System.out.println(output1);
    }
    
}
