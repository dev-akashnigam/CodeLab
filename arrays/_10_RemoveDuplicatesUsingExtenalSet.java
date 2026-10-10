import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class _10_RemoveDuplicatesUsingExtenalSet {
    private static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int element: arr) {
                set.add(element);
        }
        int n = set.size();
        int[] newArr = new int[n];
        int i = 0;
        for(int element: set) {
            newArr[i] = element;
            i++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        final int[] input = {1, 2 ,3, 2, 4, 5, 1};
        final int[] output = removeDuplicates(input);
        System.out.println(Arrays.toString(output));
    }
}
