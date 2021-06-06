import java.util.InputMismatchException;
import java.util.Scanner;

// ------------------------------------------------------------
// Assignment: 2
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
Simple program for scheduling an appointment to be vaccinated. 
The relevant data is stored in arrays of strings and vaccine objects for ease of formatted printing
and to make it easy to add data in the future (if that were to be necessary). Error handling is dealt 
with in two primary ways: incorrect type (string instead of int) is handled with a try/catch which displays 
a message and restarts the loop, whereas incorrect int input simply restarts the loop.
*/

public class VaccineScheduler {

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

        final String FORMATTED_PROMPT = "\nEnter a number corresponding to your choice: ";

        do {
            try {
                // Print prompt, formatted name of each vaccine, and quit option.
                System.out.println("Please choose from the following vaccines: ");
                for (int i = 0; i < VACCINES.length; i++) {
                    VACCINES[i].printFormattedName();
                }
                printFormattedQuitOption(VACCINES.length + 1);

                // Prompt and storage of vaccine choice.
                System.out.print(FORMATTED_PROMPT);
                userInputs[0] = reader.nextInt();

                // ***** ERROR HANDLING - VACCINE *****

                // Quit.
                if (userInputs[0] == VACCINES.length + 1) {
                    break;
                }

                // Invalid.
                if (userInputs[0] < 1 || userInputs[0] > VACCINES.length + 1) {
                    continue;
                }

                // Check availability and reject with message if false.
                if (!VACCINES[userInputs[0] - 1].isAvailableInCanada()) {
                    VACCINES[userInputs[0] - 1].printUnavailableMessage();
                    break;
                }

                // ***** END OF ERROR HANDLING *****

                System.out.println("\nPlease choose a location: ");

                int locationsAvailable = 0;

                // Print locations available depending on vaccine choice and quit message.
                switch (userInputs[0]) {
                    case 1, 2:
                        System.out.println("\t" + "1 - " + LOCATIONS[0]);
                        System.out.println("\t" + "2 - " + LOCATIONS[1]);
                        locationsAvailable += 2;
                        break;
                    case 3:
                        System.out.println("\t" + "1 - " + LOCATIONS[2]);
                        System.out.println("\t" + "2 - " + LOCATIONS[4]);
                        locationsAvailable += 2;
                        break;
                    case 4:
                        System.out.println("\t" + "1 - " + LOCATIONS[3]);
                        locationsAvailable++;
                        break;
                    // Shouldn't be necessary. All cases are handled.
                    default:
                        break;
                }
                printFormattedQuitOption(locationsAvailable + 1);

                // Prompt and storage of location choice.
                System.out.print(FORMATTED_PROMPT);
                userInputs[1] = reader.nextInt();

                // ***** ERROR HANDLING - LOCATION*****

                // Quit.
                if (userInputs[1] == locationsAvailable + 1) {
                    break;
                }

                // Invalid.
                if (userInputs[1] < 1 || userInputs[1] > locationsAvailable + 1) {
                    continue;
                }

                // ***** END OF ERROR HANDLING *****

                // Display of available times and quit message.
                System.out.println("\nPlease choose a time:");
                if (userInputs[1] >= 0 && userInputs[1] < VACCINES.length - 2) {
                    for (int i = 1; i <= AVAILABLE_TIMES.length; i++) {
                        System.out.println("\t" + i + " - " + AVAILABLE_TIMES[i - 1]);
                    }
                }
                printFormattedQuitOption(AVAILABLE_TIMES.length + 1);

                // Prompt and storage of schedule choice.
                System.out.print(FORMATTED_PROMPT);
                userInputs[2] = reader.nextInt();

                // ***** ERROR HANDLING - SCHEDULE *****

                // Quit.
                if (userInputs[2] == AVAILABLE_TIMES.length + 1) {
                    break;
                }

                // Invalid.
                if (userInputs[2] < 1 || userInputs[2] > AVAILABLE_TIMES.length + 2) {
                    continue;
                }

                // ***** END OF ERROR HANDLING *****

                // If all goes well, user choices are valid and we can display final output.
                valid = true;
            } catch (InputMismatchException exception) {
                System.out.println("\nPlease try again and ensure you enter a number.\n");
                reader.nextLine();
            }
        } while (!valid);

        // Clean-up.
        reader.close();

        // Final formatting if valid.
        if (valid) {
            // Print vaccine information.
            System.out.print("\nThe booked vaccine is: ");
            VACCINES[userInputs[0] - 1].printBasicInformation();

            // Print schedule information.
            System.out.println("Your schedule is: " + AVAILABLE_TIMES[userInputs[2] - 1] + " @ " + LOCATIONS[userInputs[1]] + ".");
        }

        // Closing message. Prints when execution finishes or when user quits.
        System.out.println("\nThank you for using this program!");
    }

    /*
    Method for consistent display of quit option after each prompt.
    */
    public static void printFormattedQuitOption(int number) {
        System.out.println("\t" + number + " - Quit");
    }
}

/*
Streamlines vaccine data type and provides printing functions for consistent display of information.
*/
class Vaccine {
    
    private int id;
    private String name;
    private String type;
    private int doses;

    public Vaccine(int id, String name, String type, int doses) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.doses = doses;
    }

    public void printFormattedName() {
        System.out.println("\t" + this.id + " - " + this.name);
    }

    public void printBasicInformation() {
        String doseString = (this.doses == 1) ? "dose" : "doses";
        System.out.println(this.name + " (" + this.type + ", " + this.doses + " " + doseString + ").");
    }

    // Only 4 vaccines are available in Canada.
    public boolean isAvailableInCanada() {
        return (this.id > 4) ? false : true;
    }

    public void printUnavailableMessage() {
        System.out.println("\nUnfortunately the " + this.name + " vaccine is unavailable in your region.");
    }
}
