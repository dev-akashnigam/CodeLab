public class _05_SwapValues {
    private static void printSwappedValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("a = %d, b = %d%n", a, b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        printSwappedValues(a, b);
    }
}
