package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        double score;
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score:\n>> ");
        score = scanner.nextDouble();

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
        scanner.close();
    }

}
