import java.util.ArrayList;
public class _11_PrintAllDuplicatesUsing2ExtArrays {
    private static void printAllDuplicates(int[] arr) {
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for(int element: arr) {
            if(elements.contains(element)) {
                int elementIndex = elements.indexOf(element);
                counts.set(elementIndex, counts.get(elementIndex)+1);
            } else {
                elements.add(element);
                counts.add(1);
            }
        }

        int n = elements.size();
        for(int i=0; i<n; i++) {
            if(counts.get(i) > 1) {
                System.out.println(elements.get(i));
            }
        }
    }

    public static void main(String[] args) {
        final int[] input = {1, 2 ,3, 2, 4, 5, 1};
        printAllDuplicates(input);
    }
}
