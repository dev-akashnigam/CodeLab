package pro;

import java.util.Arrays;
public class _06_Code_MaxSumSubArray {
    private static int[] getMaxSum(int[] arr) {
        final int n = arr.length;
        int currentSum = 0;
        int maxSumSoFar = -999999999;
        int startIndex = 0;
        int endIndex = 0;
        for(int i=0; i<n; i++) {
            int currentElement = arr[i];
            currentSum += currentElement;
            if(currentElement > currentSum) {
                currentSum = currentElement;
                startIndex = i;
            }
            if(currentSum > maxSumSoFar) {
                maxSumSoFar = currentSum;
                endIndex = i;
            }
        }
        return new int[]{maxSumSoFar, startIndex, endIndex};
    }

    public static void main(String[] args) {
        final int[] input = {-5, -2, -8, -1};
        final int[] output = getMaxSum(input);
        System.out.println(Arrays.toString(output));
    }
    
}
