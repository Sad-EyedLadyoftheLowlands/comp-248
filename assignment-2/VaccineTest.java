import java.util.InputMismatchException;
import java.util.Scanner;

public class VaccineTest {

    public static void main(String[] args) {
        int userInput;
        Scanner reader = new Scanner(System.in);

        boolean valid = false;

        
        do {      
            try {
                System.out.println("Enter a number:");
                userInput = reader.nextInt();
                
        


                valid = true;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a number.");
                reader.nextLine();
            }
        }
        while (!valid);
        System.out.println("Thank you for using this program.");        
    }
}
