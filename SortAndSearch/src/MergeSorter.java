public class MergeSorter {

    public static void sort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];

        // Copy the first half of a into first, and second half into second.
        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = a[first.length + i];
        }
        /*
        for (int i : first) {
            first[i] = a[i];
        }
        for (int i : second) {
            second[i] = a[first.length + i];
        }

         */

        // Recursively call sort on both then merge.
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    private static void merge(int[] first, int[] second, int[] a) {
        // Next element to consider in the first array.
        int iFirst = 0;
        // Next element to consider in the second array.
        int iSecond = 0;
        // Next open position in a.
        int j = 0;

        // So long is neither iFirst not iSecond pass the end, move smallest into a.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
