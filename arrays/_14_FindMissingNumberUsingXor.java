public class _14_FindMissingNumberUsingXor {
    private static int getMissingNumber(int[] arr) {
        int xorOfArrayElements = 0;
        for(int element: arr) {
            xorOfArrayElements = xorOfArrayElements ^ element;
        }

        int n = arr.length;
        int xorOfLoopElements = 0;
        for(int i=1; i<n+2; i++) {
            xorOfLoopElements = xorOfLoopElements ^ i;
        }

        int missingElement = xorOfArrayElements ^ xorOfLoopElements;
        return missingElement;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2, 3, 5, 6};
        final int output = getMissingNumber(input);
        System.out.println(output);
    }
}
