import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(10000, 100);
        System.out.println("Printing initial array");

        System.out.println(Arrays.toString(a));

        final long startTime = System.currentTimeMillis();

        // 55ms 10000 7m for 1 million
        // SelectionSorter.sort(a);

        // 2-5ms 10000 96ms for 1 million
        MergeSorter.sort(a);
        System.out.println("Printing array after sorting.");

        System.out.println(Arrays.toString(a));


        int value = BinarySearcher.search(a, 0, a.length, 7);
        System.out.println(value);
        // System.out.println(BinarySearcher.search(a, 0, a.length, 7));

        final long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        // System.out.println(Arrays.toString(a));
    }
}
