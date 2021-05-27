import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        // Definitions.
        int a, b, c, d, num, den;
        final int CONSTANT = 4;

        // Scanner.
        Scanner reader = new Scanner(System.in);

        // Prompt for user.
        System.out.print("Input 4 positive integers: ");

        // Read in user input.
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        d = reader.nextInt();

        // Calculation.
        num = (a % d + c % b) * CONSTANT;
        den = b * d * CONSTANT;

        // Output for user.
        System.out.println("\nModified numerator is " + num);
        System.out.println("Modified denominator is " + den);
        System.out.println("Strange calculations!!!");
    }
}
