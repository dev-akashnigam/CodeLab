package pro;

import java.util.Arrays;

public class _08_Code_ArrayProductExceptSelf {
    private static int[] getProductArray(int[] arr) {
        final int n = arr.length;
        int[] prefixArr = new int[n];
        int[] suffixArr = new int[n];
        int[] answerArr = new int[n];

        for(int i=0; i<n; i++) {
            if(i==0) {
                prefixArr[i] = 1;
                continue;
            }
            prefixArr[i] = prefixArr[i-1] * arr[i-1];
        }
        //System.out.println(Arrays.toString(prefixArr));

        for(int i=n-1; i>=0; i--) {
            if(i==n-1) {
                suffixArr[i] = 1;
                continue;
            }
            suffixArr[i] = suffixArr[i+1] * arr[i+1];
        }
        //System.out.println(Arrays.toString(suffixArr));

        for(int i=0; i<n; i++) {
            answerArr[i] = prefixArr[i] * suffixArr[i];
        }

        return answerArr;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2, 3, 4};
        final int[] output = getProductArray(input);
        System.out.println(Arrays.toString(output));
    }
}
