import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        double userInput, result;
        boolean cat1 = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a double value:");
        userInput = reader.nextDouble();
        result = (userInput * 5) % 60;

        System.out.println("\nHere is the result:");

        if (result >= 30 && result < 60) {
            cat1 = true;
            System.out.println("Maybe in Category 1.");
        }

        if ((result < 30 || result % 3 == 0) && cat1 == false) {
            System.out.println("Maybe in Category 2.");
        }

        if (result % 7.5 == 0 || result % 12.5 == 0) {
            System.out.println("Maybe in Category 3.");
        }

        // System.out.println(result);

        reader.close();
    }
}