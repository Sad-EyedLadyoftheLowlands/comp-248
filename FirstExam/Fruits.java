// package FirstExam;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        String fruit;
        int tag = 0;
        int number = 0;

        System.out.println("prompt");

        fruit = keyIn.nextLine();

        for (int i = 0; i < fruit.length() - 1; i++) {
            if (fruit.charAt(i) == ',') {
                number++;
                System.out.println("your no. " + number + "favorite fruit is ");
                System.out.println(fruit.substring(tag, i));
                tag = i + 1;
            }
        }

        number++;
        System.out.println("your no. " + number + "favorite fruit is ");

        System.out.println(fruit.substring(tag));

        keyIn.close();
    }    
}
