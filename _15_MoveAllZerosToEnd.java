import java.util.Arrays;

public class _15_MoveAllZerosToEnd {
    private static int[] getArrayWithZerosMoved(int[] arr) {
        final int n = arr.length;
        int leftPointer = 0;
        int rightPointer = n-1;

        while(leftPointer<rightPointer) {
            if(arr[leftPointer] == 0) {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        final int[] input = {0, 1, 0, 3, 12};
        final int[] output = getArrayWithZerosMoved(input);
        System.out.println(Arrays.toString(output));
    }
}
