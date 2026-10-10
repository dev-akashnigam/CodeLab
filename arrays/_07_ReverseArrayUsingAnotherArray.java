import java.util.Arrays;

public class _07_ReverseArrayUsingAnotherArray {
    private static int[] getReversedArray(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        for(int i=0; i<n; i++) {
            newArr[i] = arr[n-1-i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2, 3, 4, 5};
        final int[] output = getReversedArray(input);
        System.out.println(Arrays.toString(output));
    }
}
