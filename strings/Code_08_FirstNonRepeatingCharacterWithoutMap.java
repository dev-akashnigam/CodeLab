package strings;

public class Code_08_FirstNonRepeatingCharacterWithoutMap {
    private static char getFirstNonRepeatingChar(String str) {
        final int n = str.length();
        for(int i=0; i<n; i++) {
            char currentChar = str.charAt(i);
            String leftSubs = str.substring(0, i);
            String rightSubs = str.substring(i+1, n);
            if(leftSubs.contains(String.valueOf(currentChar)) || rightSubs.contains(String.valueOf(currentChar))) {
                continue;
            } else {
                return currentChar;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        final String input = "aabbcc";
        final char output = getFirstNonRepeatingChar(input);
        System.out.println(output);
    }
}
