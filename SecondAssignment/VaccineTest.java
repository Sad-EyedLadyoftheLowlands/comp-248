// package SecondAssignment;
import java.util.InputMismatchException;
import java.util.Scanner;
// import assignment2

public class VaccineTest {

    public static void main(String[] args) {
        boolean valid = false;
        int[] userInputs = new int[3];
        Scanner reader = new Scanner(System.in);

        final Vaccine[] VACCINES = new Vaccine[6];
        VACCINES[0] = new Vaccine(1, "Pfizer", "m-RNA", 2);
        VACCINES[1] = new Vaccine(2, "Moderna", "m-RNA", 2);
        VACCINES[2] = new Vaccine(3, "AstraZeneca", "Viral vector", 2);
        VACCINES[3] = new Vaccine(4, "Johnson & Johnson", "Viral vector", 1);
        VACCINES[4] = new Vaccine(5, "Sinovac", "Inactivated virus", 2);
        VACCINES[5] = new Vaccine(6, "Gameleya", "Viral vector", 2);

        final String[] LOCATIONS = { "Pharmaprix", "Vaccination Center", "PJC Jean Coutu", "Health Center", "Uniprix Clinique" };
        
        final String[] AVAILABLE_TIMES = { "2:00-2:15", "2:20-2:35", "2:40-2:55", "3:00-3:15" };
                
        do {      
            try {
                System.out.println("Please choose from the following vaccines: ");
                for (int i = 0; i < VACCINES.length - 1; i++) { VACCINES[i].printFormattedName(); }
        
                System.out.println("Enter a number:");
                userInputs[0] = reader.nextInt();
        
                // Quit, not available, and invalid entry handling.
                if (userInputs[0] == VACCINES.length) { break; }
                if (userInputs[0] < 1 || userInputs[0] > VACCINES.length) { continue; }
                if (userInputs[0] == 5 || userInputs[0] == 6) {
                    System.out.println("Not available. Shouldn't have been included.");
                    break;
                }
        
                // I fucked up the break and continue???
                System.out.println("Please choose a location:");
                
                switch (userInputs[0]) {
                    case 1, 2:
                        System.out.println(LOCATIONS[0] + LOCATIONS[1]);
                        break;
                    case 3:
                        System.out.println(LOCATIONS[2] + LOCATIONS[4]);
                        break;
                    case 4:
                        System.out.println(LOCATIONS[3]);
                        break;
                    // Shouldn't be necessary. All cases are handled.
                    default:
                        break;
                }

                userInputs[1] = reader.nextInt();

                // Handle quit and invalid like above. I presume good input (we've already handled edge cases).
                // Maybe fit the nested if in here?

                System.out.println("Please choose a time:");

                if (userInputs[1] >= 0 && userInputs[1] < VACCINES.length -2) {
                    for (int i = 1; i <= AVAILABLE_TIMES.length; i++) { System.out.println(i + " - " + AVAILABLE_TIMES[i - 1]); }
                }

                userInputs[2] = reader.nextInt();

                // Error handling again.

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
        If valid
        */

        if (valid) {
            VACCINES[userInputs[0] - 1].printBasicInformation();
            System.out.println("Your schedule is: " + AVAILABLE_TIMES[userInputs[1]] + " @ " + LOCATIONS[userInputs[2]] + ".");
        }

        System.out.println("Thank you for using this program.");        
    }
}
