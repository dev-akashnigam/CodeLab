public class _06_SecondLargestElement {
    private static int getSecondLargestElement(int[] arr) {
        int largestElement = arr[0];
        int secondLargestElement = -999999999;

        for(int element : arr) {
            if(element>largestElement) {
                secondLargestElement = largestElement;
                largestElement = element;
            } else if(element<largestElement && element>secondLargestElement) {
                secondLargestElement = element;
            } else {
                continue;
            }
        }
        return secondLargestElement;
    }

    public static void main(String[] args) {
        final int[] input = {10, 5, 20, 8, 15};
        final int output = getSecondLargestElement(input);
        System.out.println(output);
    }
}