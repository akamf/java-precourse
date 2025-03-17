package AngieJones.chapter4;

import java.util.Scanner;

public class AverageTestScores {
     public static void calculateScores() {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 24;
        int numberOfTests = 4;

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0.0;
            System.out.printf("Evaluating scores for student #%d%n", (i+1));

            for (int j = 0; j < numberOfTests; j++) {
                System.out.printf("Enter the score for test #%d:%n>> ", (j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.printf("Average score for student #%d is %.2f. %n%n", (i+1), average);
        }

        scanner.close();
    }
}
