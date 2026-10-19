package pro;

import java.util.*;
public class _03_Code_RemoveDuplicates {
    private static int[] getArrayWithDuplicatesRemoved(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        for(int element: arr) {
            mySet.add(element);
        }

        //System.out.println(mySet);

        int index = 0;
        for(int element: mySet) {
            arr[index] = element;
            index++;
        }

        //System.out.println(Arrays.toString(arr));

        final int n = arr.length;
        while(index < n) {
            arr[index] = 999999999;
            index++;
        }

        //System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        final int[] input = {1, 1, 2, 2, 3};
        final int[] output = getArrayWithDuplicatesRemoved(input);
        System.out.println(Arrays.toString(output));
    }
}