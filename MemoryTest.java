import java.util.ArrayList;

public class MemoryTest {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        int counter = 0;
    
        final long startTime = System.currentTimeMillis();
        while(counter<1000000)
        {
            ints.add(9);
            counter++;
        }

        final long endTime = System.currentTimeMillis();

        System.out.println("Elapsed time: " + (endTime - startTime));
        /*
        for (int x : ints) {
            System.out.println(x);
        }
        */
    }
}
