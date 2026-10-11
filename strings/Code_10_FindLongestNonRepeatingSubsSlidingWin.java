package strings;

import java.util.HashSet;
import java.util.Set;

public class Code_10_FindLongestNonRepeatingSubsSlidingWin {
    private static String getLongestNonRepeatingString(String str) {
        final int n = str.length();
        int leftPointer = 0;
        int rightPointer = 1;
        Set<Character> mySet = new HashSet<>();
        mySet.add(str.charAt(leftPointer));
        String longestSubs = "";
        int longestSubsLength = -999999999;
        String currentSubs = "";
        int currentSubsLength = -999999999;
        while(rightPointer<n) {
            if(mySet.contains(str.charAt(rightPointer))) {
                while(str.charAt(leftPointer)!=str.charAt(rightPointer)) {
                    mySet.remove(str.charAt(leftPointer));
                    leftPointer++;
                }
                leftPointer++;
            } else {
                mySet.add(str.charAt(rightPointer));
                currentSubs = str.substring(leftPointer, rightPointer+1);
                currentSubsLength = currentSubs.length();
                if(currentSubsLength > longestSubsLength) {
                    longestSubsLength = currentSubsLength;
                    longestSubs = currentSubs;
                }
            }
            rightPointer++;
        }
        return longestSubs;
    }

    public static void main(String[] args) {
        final String input = "abcdeaf";
        final String output = getLongestNonRepeatingString(input);
        System.out.println(output);
    }
}
