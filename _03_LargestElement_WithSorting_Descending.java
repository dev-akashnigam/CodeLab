import java.util.Arrays;
public class _03_LargestElement_WithSorting_Descending {
    private static int getLargestElement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        return arr[n-1];
    }
    public static void main(String[] args) {
        int[] input = {10, 5, 20, 8, 15};
        int output = getLargestElement(input);
        System.out.println(output);
    }
}
