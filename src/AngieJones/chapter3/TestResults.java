package AngieJones.chapter3;

import java.util.Scanner;

public class TestResults {
    public static void getTestResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your test score:%n>> ");

        double score = scanner.nextDouble();
        char grade = getGrade(score);
        String message = getGradeMessage(grade);

        System.out.printf("Your grade is %s. %s\n", grade, message);

        scanner.close();
    }

    public static char getGrade(double score) {
        if (score < 60)
            return 'F';
        else if (score < 70)
            return 'D';
        else if (score < 80)
            return 'C';
        else if (score < 90)
            return 'B';

        return 'A';
    }

    public static String getGradeMessage(char grade) {
        return switch (grade) {
            case 'A' -> "Excellent job!";
            case 'B' -> "Great job!";
            case 'C' -> "Good job!";
            case 'D' -> "You need to work a little harder!";
            case 'F' -> "Uh oh!";
            default -> "Error! Invalid grade";
        };
    }
}
