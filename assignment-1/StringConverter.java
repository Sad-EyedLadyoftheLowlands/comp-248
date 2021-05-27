import java.util.Scanner;

// ------------------------------------------------------------
// Assignment: 1
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
A simple program to take apart and alter strings. I compose a string array after separating
the sections of the string so that at the end it is much simpler to systematically alter the
formatting and to control the display.
*/

public class StringConverter {
    public static void main(String[] args) {
        // Definitions.
        int temp;
        String firstWord, secondWord, thirdWord;
        String[] strings = new String[6];
        Scanner reader = new Scanner(System.in);

        // Display header.
        System.out.println("\\\\+++++++++++++++++++++++++++++++++++++\\\\");
        System.out.println("\\\\\tString Converter Program\t\\\\");
        System.out.println("\\\\+++++++++++++++++++++++++++++++++++++++\\\\\n");

        // Prompt user for first word and populate array.
        System.out.println("Enter the first word:");
        firstWord = reader.nextLine();
        temp = firstWord.indexOf("_");
        strings[0] = firstWord.substring(0, temp);
        strings[1] = firstWord.substring(++temp);
        
        // Prompt user for second word and populate array.
        System.out.println("Enter the second word:");
        secondWord = reader.nextLine();
        temp = secondWord.indexOf("_");
        strings[2] = secondWord.substring(0, temp);
        strings[3] = secondWord.substring(++temp);
        
        // Prompt user for third word and populate array.
        System.out.println("Enter the third word:");
        thirdWord = reader.nextLine();
        temp = thirdWord.indexOf("_");
        strings[4] = thirdWord.substring(0, temp);
        strings[5] = thirdWord.substring(++temp);

        // Handle formatting.
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
            }
        }

        // Print formatted result.
        System.out.println(strings[1] + " " + strings[0] + " " 
            + strings[3] + " " + strings[2] + " " 
            + strings[5] + " " + strings[4]);

        // Display final output.
        System.out.println("Thank you for using this program!!\n");
        
        // Tear-down.
        reader.close();
    }    
}
