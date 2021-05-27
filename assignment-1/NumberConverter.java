import java.util.Scanner;

// ------------------------------------------------------------
// Assignment: 1
// Written by: Dylan Baird (40046289)
// For COMP 248 Section (EC 2211) - Summer 2021
// ------------------------------------------------------------

/*
As per instructions, this program performs various calculations with an 8 digit number.
I read the number as a string and ultimately convert it to a character array so as to be
able to access individual digits while also conceiving of it as a whole. A simple integer
would not suffice because (to my knowledge) you cannot access individual digits of an int.
*/

class NumberConverter {
    public static void main(String[] args) {
        // Definitions.
        String userInput, swappedUserInput;
        char[] userInputChars;
        char temp;
        int num1, num2, num3, solution;
        final int REMAINDER = 20;
        Scanner reader = new Scanner(System.in);
        
        // Display header.
        System.out.println("\\\\-------------------------------------\\\\");
        System.out.println("\\\\\tNumber Converter Program\t\\\\");
        System.out.println("\\\\---------------------------------------\\\\");

        // Prompt user for input.
        System.out.println("\nEnter a number with 8 digits:");

        // Read values, display prompt, set-up.
        userInput = reader.nextLine();
        userInputChars = userInput.toCharArray();

        // Solve for num1.
        int x = Integer.parseInt(userInput.substring(0, 4));
        num1 = x % REMAINDER;

        // Solve for num2.
        num2 = Character.getNumericValue(userInputChars[4]) 
            + Character.getNumericValue(userInputChars[5]);

        // Solve for num3.
        temp = userInputChars[6];
        userInputChars[6] = userInputChars[7];
        userInputChars[7] = temp;
        swappedUserInput = new String(userInputChars);
        num3 = Integer.parseInt(swappedUserInput.substring(6, 8));

        // Solve for final output.
        solution = num1 + num2 + num3;

        // Display final output.
        System.out.println("The output result is: " + solution + 
            "\n\nThank you for using this program!!");

        // Tear-down.
        reader.close();
    }
}