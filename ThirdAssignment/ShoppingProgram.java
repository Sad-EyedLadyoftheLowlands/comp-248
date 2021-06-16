import java.util.Scanner;

public class ShoppingProgram {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // User input, quantity.
        System.out.println("How many?");
        int totalAmount = reader.nextInt();

        // Array definition.
        int[][] items = new int[totalAmount][2];
        String[] names = new String[totalAmount];

        // User input, items.
        for (int i = 0; i < totalAmount; i++) {
            System.out.println("Enter data:");

            names[i] = reader.next();
            items[i][0] = reader.nextInt();
            items[i][1] = reader.nextInt();
        }

        System.out.println();

        // Table header.
        System.out.format("%10s%10s%10s%10s%10s", "ITEM #", "NAME", "QTY", "PRICE", "SUBTOTAL");
        System.out.println();

        // Table output and total calculation.
        int total = 0;
        for (int i = 0; i < items.length; i++) {
            final String NAME = names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase();
            final String UNIT_PRICE = "$" + items[i][1];
            final int SUBTOTAL_PRICE = items[i][0] * items[i][1];
            final String SUBTOTAL = "$" + SUBTOTAL_PRICE;
            System.out.format("%10d%10s%10d%10s%10s", i + 1, NAME, items[i][0], UNIT_PRICE, SUBTOTAL);
            System.out.println();
            total += SUBTOTAL_PRICE;
        }

        System.out.println();
        System.out.format("%40s%10s", "TOTAL QTY", "TOTAL\n");
        final String TOTAL_QTY = "You have " + totalAmount + " items in total.";
        final String TOTAL = "$" + total;
        System.out.format("%30s%10d%10s", TOTAL_QTY, totalAmount, TOTAL);
        System.out.println();

        // System.out.println("You have " + totalAmount + " items in total.");
    }    
}
