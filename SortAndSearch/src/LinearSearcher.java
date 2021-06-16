public class LinearSearcher {

    public static int search(int[] a, int value) {
        for (int i : a) {
            if (i == value) {
                return i;
            }
        }
        return -1;
    }
}
