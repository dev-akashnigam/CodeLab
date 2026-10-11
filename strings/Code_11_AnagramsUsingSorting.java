package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code_11_AnagramsUsingSorting {
    private static boolean checkAnagrams(String str1, String str2) {
        final int n1 = str1.length();
        final int n2 = str2.length();
        if(n1!=n2) {
            return false;
        }
        List<Character> strList1 = new ArrayList<>();
        List<Character> strList2 = new ArrayList<>();
        for(int i=0; i<n1; i++) {
            strList1.add(str1.charAt(i));
            strList2.add(str2.charAt(i));
        }
        Collections.sort(strList1);
        Collections.sort(strList2);
        return strList1.equals(strList2);
    }

    public static void main(String[] args) {
        final String input1 = "dormitory";
        final String input2 = "dirtyroom";
        final boolean output = checkAnagrams(input1, input2);
        System.out.println(output);
    }
}
