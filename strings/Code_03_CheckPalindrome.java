package strings;

public class Code_03_CheckPalindrome {
    private static boolean isPalindrome(String str) {
        final int n = str.length();
        int leftPointer = 0;
        int rightPointer = n-1;
        
        while(leftPointer < rightPointer) {
            if(str.charAt(leftPointer) == str.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final String input ="madame";
        final boolean output = isPalindrome(input);
        System.out.println(output);
    }
}
