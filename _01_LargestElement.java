public class _01_LargestElement {
    private static int getLargestElement(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i]>largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
    public static void main(String[] args) {
        int[] input = {10, 5, 20, 8, 15};
        int output = getLargestElement(input);
        System.out.println(output);
    }
}