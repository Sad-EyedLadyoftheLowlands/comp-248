public class LoopToFive {
    public static void main(String[] args) {
        int NUM_OF_LINES = 5;
        int x = 1;
        

        final int ROWS = 5;
        /*
        // Loop for each line.
        for (int i = NUM_OF_LINES; i > 0; i--) {
            for (int x = 1; x <= NUM_OF_LINES; x++) {
                for (int y = x; y <= NUM_OF_LINES; y++) {
                    System.out.print(y);
                }
            System.out.println();
            }
        }
        */

        /*
        for (int i = NUM_OF_LINES; i > 0; i--) {
            for (int y = x; y <= NUM_OF_LINES; y++) {
                System.out.print(y);
            }
            x++;
            System.out.println();
        }
        */

        // PROF SOLUTION
        for (int row = 1; row <= ROWS; row++) {
            for (int col = row; col <= ROWS; col++) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }


    }
}
