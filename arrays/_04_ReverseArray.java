import java.util.Arrays;

public class _04_ReverseArray {
    private static int[] getReversedArray(int[] arr) {
        int n = arr.length;
        int leftPointer = 0;
        int rightPointer = n-1;
        while(leftPointer<rightPointer) {
            int temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int[] output = getReversedArray(input);
        System.out.println(Arrays.toString(output));
    }
    
}
