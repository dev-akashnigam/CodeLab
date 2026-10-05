import java.util.ArrayList;
import java.util.Arrays;
public class _09_RemoveDuplicatesUsingExternalArray {
    private static int[] removeDuplicateElements(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int element: arr) {
            if(arrayList.contains(element)) {
                continue;
            } else {
                arrayList.add(element);
            }
        }
        int n = arrayList.size();
        int[] newArr = new int[n];
        for(int i=0; i<n; i++) {
            newArr[i] = arrayList.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2 ,3, 2, 4, 5, 1};
        final int[] output = removeDuplicateElements(input);
        System.out.println(Arrays.toString(output));
    }
    
}
