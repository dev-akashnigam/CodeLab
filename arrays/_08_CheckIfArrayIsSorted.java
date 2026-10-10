public class _08_CheckIfArrayIsSorted {
    private static boolean isArraySorted(int[] arr) {
        final int n = arr.length;
        boolean sortedAscending = true;
        boolean sortedDescending = true;

        for(int i=1; i<n; i++) {
            if(arr[i-1] <= arr[i]) {
                continue;
            } else {
                sortedAscending = false;
                break;
            }
        }

        if(sortedAscending) {
            return sortedAscending;
        } else {
            for(int i=1; i<n; i++) {
                if(arr[i-1] >= arr[i]) {
                    continue;
                } else {
                    sortedDescending = false;
                    break;
                }
            }
            return sortedDescending;
        }
    }

    public static void main(String[] args) {
        final int[] input = {1, 2, 4, 5};
        final boolean output = isArraySorted(input);
        System.out.println(output);
    }
}
