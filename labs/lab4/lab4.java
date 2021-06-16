import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num, res, rem, temp;
        int counter = 0;

        System.out.print("Enter an integer number: ");
        num = reader.nextInt();

        temp = num;

        do {
            // Calculation.
            res = temp / 3;
            rem = temp % 3;

            if (res != 0) {
                System.out.println(temp + "/3 = " + res + " with remainder " + rem);
                counter++;
                temp = res;
            }
            else { break; }

        } while (res != 0);

        System.out.println("\n" + counter + " division(s) was/were performed!");
    }
    
}
