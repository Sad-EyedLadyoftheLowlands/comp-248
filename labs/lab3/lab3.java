import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter 3 integer numbers: ");
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        if (a == b && b == c) {
            System.out.println("\nAll 3 numbers are the same");
        }
        else if (a == b) {
            System.out.println("\nFirst and second numbers are the same and have the value " + a);
        }
        else if (a == c) {
            System.out.println("\nFirst and third numbers are the same and have the value " + a);
        }
        else if (b == c) {
            System.out.println("\nSecond and third numbers are the same and have the value " + b);
        }
        else {
            int temp =  Math.min(a, b);
            temp = Math.min(temp, c);
            System.out.println("\nAll numbers are different and the smallest number has the value " + temp);
        }
    }
}
