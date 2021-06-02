import java.util.Scanner;

/*
Simple program to display multiples of three between (inclusive) two numbers.

I first establish the smallest of the two numbers, then increment this number until
it reaches the largest asking each time if it is a multiple of 3. If yes, I print the 
number while keeping track of numbers per line to achieve formatting goal.
*/

public class Numbers {
    public static void main(String[] args) {
        // Variable definitions.
        Scanner reader = new Scanner(System.in);
        int num1, num2, start, end;
        int lineCounter = 0;

        // Initial prompt and storage of user input.
        System.out.println("Please enter two integers:");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        // Populate start with the smallest number to begin loop.
        start = (num1 < num2) ? num1 : num2;

        // Populate end with largest number to know where to end loop.
        end = (num1 > num2) ? num1 : num2;

        // Header before loop.
        System.out.println("Here are the results:");

        do {
            // Determine if multiple of 3 and print. lineCount ensure we only print 3 numbers per line.
            if (start % 3 == 0) {
                System.out.print(start + "\t");
                lineCounter++;
            }

            // Start on next line for next iteration of loop if we have reached 3 numbers on the line.
            if (lineCounter == 3) {
                lineCounter = 0;
                System.out.println();
            }

            // Increment smallest number for next iteration of loop.
            start++;
        }
        // Ensure that we only reach the largest number but do not pass it.
        while (start <= end);
    }    
}
