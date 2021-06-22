import java.util.Scanner;

// ------------------------------------------------------------
// Assignment: 3
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
A simple program to handle a shopping list. A 2D array stores the quantity and price, and each position
correlates with the same position in a String array for ease of reference. The output is formatted as a 
table with format method of System.out. Zero case is handled seperately.
*/

public class ShoppingProgram {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Display header.
        System.out.println("\\\\-------------------------------------\\\\");
        System.out.println("\\\\\tItem Shopping Program\t\t\\\\");
        System.out.println("\\\\---------------------------------------\\\\\n");

        // User input, quantity.
        System.out.println("How many items do you have?");
        int totalAmount = reader.nextInt();

        // Handle zero case.
        if (totalAmount == 0) {
            System.out.println("You have 0 items.\n");
            System.out.println("Thank you for using the program!");
            return;
        }

        // Array definition.
        int[][] items = new int[totalAmount][2];
        String[] names = new String[totalAmount];

        // User input, items.
        System.out.println("Please enter items in the following format: name quantity price");
        for (int i = 0; i < totalAmount; i++) {
            System.out.println("Enter item # " + (i + 1));

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

        // Final output of user entered values.
        System.out.println();
        System.out.format("%40s%10s", "TOTAL QTY", "TOTAL\n");
        final String TOTAL_QTY = "You have " + totalAmount + " items in total.";
        final String TOTAL = "$" + total;
        System.out.format("%40d%10s", totalAmount, TOTAL);
        System.out.println();
    }    
}
