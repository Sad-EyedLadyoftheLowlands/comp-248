import javax.lang.model.util.ElementScanner14;

public class Sandbox {
    public static void main(String[] args) {
        /*
        double num = (double) (5 / 10.0);
        
        System.out.println(num);
        
        int x = 0;
        
        System.out.println("Start 1");
        
        if (x <= 3)
        
            if (x != 0)
        
                System.out.println("Cat");
        
            else
        
            System.out.println("Dog");
        
        System.out.println("End 1");
        
        System.out.println("Start 2");
        
        if (x >= 10)
        
            if (x != 10)
        
                System.out.println("Elephant");
        
            else
        
            System.out.println("Tiger");
        
        System.out.println("End 2");
        */
        
        int num = 15;

        if (num >= 10 && num < 100)
        {
            int remainder = num % 7;
            if (remainder == 0) {
                num++;
            } else if (remainder == 1) {
                num += 5;
            } else if (remainder == 3 || remainder == 4) {
                num *= 2;
            } else {
                num--;
            }
        }
        System.out.println(num);


    }
}