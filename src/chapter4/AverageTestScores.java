package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0.0;
            System.out.printf("Evaluating scores for student #%d%n", (i+1));

            for (int j = 0; j < numberOfTests; j++) {
                System.out.printf("Enter the score for test #%d:%n>> ", (j+1));
                double score = SCANNER.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.printf("Average score for student #%d is %.2f. %n%n", (i+1), average);
        }

        SCANNER.close();
    }
}
