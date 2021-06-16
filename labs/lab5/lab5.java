import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String userInput;
        char[] userInputArray;

        System.out.print("Enter a string: ");

        userInput = reader.nextLine();
        userInputArray = userInput.toCharArray();

        System.out.println();

        // Descending loop.
        for (int i = userInputArray.length; i >= 0; i--) {
            for (int j = 0; j < i; j++) { System.out.print(userInputArray[j] + "\t"); }
            if (i > 0) { System.out.println(); }
        }

        // Ascending loop.
        for (int i = 1; i < userInputArray.length; i++) {
            for (int j = 0; j <= i; j++) { System.out.print(userInputArray[j] + "\t"); }
            System.out.println();
        }
    }
}
