import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str, another = "y";
        int left, right;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Enter a string:");
            str = reader.next();
            left = 0;
            right = str.length() - 1;

            while (str.charAt(left) == str.charAt(right) && left < right) {
                left++;
                right--;
            }
            
            System.out.println((left < right) ? "NO" : "YES");
            System.out.println ("Test another string?");
            another = reader.next();
        }
        while (another.equalsIgnoreCase("y"));
    }
}
