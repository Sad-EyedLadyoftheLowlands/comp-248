import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int input;
        boolean leapYear;
        Scanner reader = new Scanner(System.in);

        input = reader.nextInt();

        if (input % 400 == 0) 
            leapYear = true;
        else
            if (input % 100 == 0) 
                leapYear = false;
            else 
                if (input % 4 == 0) 
                    leapYear = true;
                else 
                    leapYear = false;

        System.out.println(leapYear);
    }
    
    public static void BetterNested() {
        int input;
        boolean leapYear;
        Scanner reader = new Scanner(System.in);

        input = reader.nextInt();

        // Use if and else if with a final else for the false condition case.
    }
}
