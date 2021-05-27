import java.util.InputMismatchException;
import java.util.Scanner;

public class VaccineTest {

    public static void main(String[] args) {
        int userInput;
        Scanner reader = new Scanner(System.in);
        boolean valid = false;

        int[] userInputs = new int[3];
        String[][] vacTypeDose = {
            { "Pfizer", "m-RNA", "2" },
            { "Moderna", "m-RNA", "2" }
        };



        
        do {      
            try {
                System.out.println("Please choose from the following vaccines: ");
                for (int i = 0; i < vacTypeDose[0].length - 1; i++) {
                    System.out.println(vacTypeDose[0][i]);
                }
                System.out.println("Enter a number:");
                userInputs[0] = reader.nextInt();

                valid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a number.");
                reader.nextLine();
            }
        }
        while (!valid);

        /*
        Handle final formatting.
        */
        // if (userInputs[0] == 1) { 
        System.out.println(vacTypeDose[userInputs[0]][0] + vacTypeDose[userInputs[0]][1] + vacTypeDose[userInputs[0]][2]);
        
        System.out.println("Thank you for using this program.");        
    }
}
