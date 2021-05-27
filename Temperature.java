import java.util.*;
import java.System.*;

public class Temperature 
{
    public static void main(String[] args) 
    {
        double f, c;
        final int DIFF = 32;
        final double RATIO = 5.0 / 9;

        Scanner in = new Scanner(System.in);

        Logger.getGlobal().info("Enter the temperature in celsius:");
        c = in.nextInt();

        f = (c * RATIO) + DIFF;

        Logger.getGlobal().info("The temperature " + c + " in celsius "
            + "is " + f + " in F.");
                
        in.close();
        
        int nb =50;
        int x;
        x = ++nb;

        System.out.println(nb);
        System.out.println(x);

    }
}
