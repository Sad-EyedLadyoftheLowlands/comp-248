public class TwoDArrayHuge {
    public static void main(String[] args) {
        char[][] page = new char[99999][99999];

        int row, col;
        for (row = 0; row < page.length; row++) {
            for (col = 0; col < page[row].length; col++) {
                page[row][col] = 'z';
            }
        }
    }
    
}
