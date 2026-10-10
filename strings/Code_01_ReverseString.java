package strings;

public class Code_01_ReverseString {
    private static String getReversedString(String str) {
        final int n = str.length();
        String revStr = "";
        for(int i=n-1; i>=0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static void main(String[] args) {
        final String input = "Mphasis";
        final String output = getReversedString(input);
        System.out.println(output);
    }
}
