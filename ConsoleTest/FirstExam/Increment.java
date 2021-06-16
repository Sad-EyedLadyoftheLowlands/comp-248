public class Increment {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int z = 2;

        int q = ++x * y-- + z++;
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);
        System.out.print(q);

    }    
}
