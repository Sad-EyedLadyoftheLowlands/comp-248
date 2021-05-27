import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        int numStudents, avg, numAboveAvg, total;
        int[] grades;
        Scanner reader = new Scanner(System.in);

        System.out.println("Number of students: ");
        numStudents = reader.nextInt();

        grades = new int[numStudents];
        total = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the " + i + " grade: ");
            grades[i] = reader.nextInt();
            total += grades[i];
        }
        
        avg = total / numStudents;

        // Here you could also create an array for each above average to store the grade.
        numAboveAvg = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > avg) 
                numAboveAvg++;
        }

        System.out.println("There are " + numAboveAvg + " students above average.");

    }
    
}
