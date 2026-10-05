public class _13_FindMissingNumber {
    private static int getMissingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = ((n+1)*(n+2))/2;
        int actualSum = 0;
        for(int element: arr) {
            actualSum += element;
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2, 3, 5, 6};
        final int output = getMissingNumber(input);
        System.out.println(output);
    }
}
