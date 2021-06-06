import java.util.Scanner;

// ------------------------------------------------------------
// Assignment: 2
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
A simple program to output something like an inventory of fruit. I understand the user input
to be able to be first split into 'sections' which encompasses each fruit (both name and count).
Then, each section can be split into the resulting name and number. I perform basic handling of zero,
single, and multiple values to ensure that the plural form of each fruit is used appropriately. 
*/

public class FruitParser {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String userString;
        String[] fruitStrings;
        int fruitCount = 0;

        // Display header.
        System.out.println("\\\\-------------------------------------\\\\");
        System.out.println("\\\\\tString Converter Program\t\\\\");
        System.out.println("\\\\---------------------------------------\\\\\n");

        // Prompt and storage of user input.
        System.out.println(
                "Please enter a string with the following format \"number!name&number2!name2&numer3!name3\": \n");
        userString = reader.nextLine();

        // Converting input to array of each section.
        fruitStrings = userString.split("&");

        // Loop for printing fruits. Within loop each 'section' is split to obtain name and number seperately.
        System.out.print("\nYou have ");
        for (String section : fruitStrings) {
            String[] numberName = section.split("!");

            // Parsed number from section is stored to perform zero handling.
            int number = Integer.parseInt(numberName[0]);

            // Print nothing from this loop if there are zero items.
            if (number == 0) {
                continue;
            }

            // Formatting for plural and printing quantity of each fruit.
            String finalString = (number > 1) ? "s, " : ", ";
            System.out.print(number + " " + numberName[1] + finalString);
            fruitCount += number;
        }

        // Final output changes depending on fruitCount value.
        if (fruitCount == 0) {
            System.out.println(fruitCount + " items in total.");
        }
        else if (fruitCount == 1) {
            System.out.println("and there is " + fruitCount + " item in total.");
        }
        else {
            System.out.println("and there are " + fruitCount + " items in total.");
        }

        // Final message.
        System.out.println("\nThank you for using this program!");
    }    
}