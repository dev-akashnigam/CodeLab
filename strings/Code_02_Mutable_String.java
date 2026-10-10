package strings;

public class Code_02_Mutable_String {
    private static StringBuilder getMutableString(String str) {
        StringBuilder strbldr = new StringBuilder(str);
        return strbldr;
    }

    public static void main(String[] args) {
        final String input = "Hello";
        final StringBuilder output = getMutableString(input);
        System.out.println(output);
    }
    
}
