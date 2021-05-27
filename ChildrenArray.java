import java.util.Scanner;

public class ChildrenArray {
    public static void main(String[] args) {
        final int NUM_CHILDREN = 10;
        Scanner reader = new Scanner(System.in);
        int[] agesCount = new int[10];

        System.out.println("Enter ages of 10 children from 0 to 10");
        for (int i = 0; i < NUM_CHILDREN; i++) {
            int userInput = reader.nextInt();
            agesCount[userInput]++;
        }

        for (int i = 0; i < NUM_CHILDREN; i++) {
            System.out.println("There are " + agesCount[i] + " children who are " + i + " years old.");
        }
    }
    
}
