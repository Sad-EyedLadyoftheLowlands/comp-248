// package SecondAssignment;
import java.util.InputMismatchException;
import java.util.Scanner;
// import assignment2

public class VaccineTest {

    public static void main(String[] args) {
        int userInput;
        Scanner reader = new Scanner(System.in);
        boolean valid = false;

        final Vaccine[] VACCINES = new Vaccine[6];
        VACCINES[0] = new Vaccine(1, "Pfizer", "m-RNA", 2);
        VACCINES[1] = new Vaccine(2, "Moderna", "m-RNA", 2);
        VACCINES[2] = new Vaccine(3, "AstraZeneca", "Viral vector", 2);
        VACCINES[3] = new Vaccine(4, "Johnson & Johnson", "Viral vector", 2);
        VACCINES[4] = new Vaccine(5, "Sinovac", "Inactivated virus", 2);
        VACCINES[5] = new Vaccine(6, "Gameleya", "Viral vector", 2);


        // String[] userInputs = new String[3];
        int[] userInputs = new int[3];


        final String[][] VAC_TYPE_DOSES = {
            { "Pfizer", "m-RNA", "2" },
            { "Moderna", "m-RNA", "2" },
            { "AstraZeneca", "Viral vector", "2" },
            { "Johnson & Johnson", "Viral vector", "2" },
            { "Sinovac", "Inactivated virus", "2" },
            { "Gameleya", "Viral vector", "2" },
        };

        final String[] LOCATIONS = { "Pharmaprix", "Vaccination Center", "PJC Jean Coutu", "Health Center", "Uniprix Clinique" };

        final String[] AVAILABLE_TIMES = { "2:00-2:15", "2:20-2:35", "2:40-2:55", "3:00-3:15" };
        
        do {      
            try {
                System.out.println("Please choose from the following vaccines: ");
                /*
                for (int i = 0; i < VAC_TYPE_DOSES[0][0].length - 1; i++) {
                    System.out.println(VAC_TYPE_DOSES[0][i]);
                }
                */
                for (int i = 0; i < VACCINES.length - 1; i++) {
                    // System.out.println(VACCINES[i].printName();)
                    VACCINES[i].printName();
                }



                System.out.println("Enter a number:");
                userInput = reader.nextInt();

                // Quit and invalid entry handling.
                if (userInput == VAC_TYPE_DOSES[0].length) { break; }
                if (userInput < 1 || userInput > VAC_TYPE_DOSES[0].length) { continue; }

                
                System.out.println("Please choose a location:");
                if (userInput > 0 && userInput < 3) { System.out.println(LOCATIONS[0] + LOCATIONS[1]); }
                if (userInput == 3 ) { System.out.println(LOCATIONS[2] + LOCATIONS[4]); }
                if (userInput == 4 ) { System.out.println(LOCATIONS[3]); }
                



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
        // System.out.println(VAC_TYPE_DOSES[userInputs[0]][0] + VAC_TYPE_DOSES[userInputs[0]][1] + VAC_TYPE_DOSES[userInputs[0]][2]);
        
        System.out.println("Thank you for using this program.");        
    }
}
