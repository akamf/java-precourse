package chapter3;

import java.util.Scanner;

public class TestResults {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double score;
        char grade;

        System.out.printf("Enter your test score:%n>> ");
        score = SCANNER.nextDouble();

        if (score < 60)
            grade = 'F';
        else if (score < 70)
            grade = 'D';
        else if (score < 80)
            grade = 'C';
        else if (score < 90)
            grade = 'B';
        else
            grade = 'A';

        System.out.printf("Your grade is %s", grade);
        SCANNER.close();
    }

}
