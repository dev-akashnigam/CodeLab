import java.util.Map;
import java.util.HashMap;
public class _12_PrintDuplicateElementsUsingMap {
    private static void printAllDuplicateElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int element: arr) {
            if(map.containsKey(element)) {
                map.put(element, map.get(element)+1);
            } else {
                map.put(element, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        final int[] input = {1, 2 ,3, 2, 4, 5, 1};
        printAllDuplicateElements(input);
    }
}
