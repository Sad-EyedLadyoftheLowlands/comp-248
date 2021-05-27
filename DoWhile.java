import java.util.Scanner;

/*
Note that entering a letter crashes the program. Not very robust...
*/
public class DoWhile {
    public static void main(String[] args) {
        int age;
        boolean valid;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Enter age");
            age = reader.nextInt();

            valid = (age > 0) && (age < 125);
            if (!valid)
                System.out.println("Invalid");
        }
        while(!valid);

        System.out.println("Valid");
    }
    
    
}
