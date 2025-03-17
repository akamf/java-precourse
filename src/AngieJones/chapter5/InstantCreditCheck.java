package AngieJones.chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    public static final int REQUIRED_SALARY = 25_000;
    public static final int REQUIRED_CREDIT_SCORE = 700;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();

        if (isUserQualified(creditScore, salary))
            System.out.println("Congratulations! You qualify for a loan.");
        else
            System.out.println("Sorry! You don't qualify.");

        SCANNER.close();
    }

    public static double getSalary() {
        System.out.printf("Enter your salary:%n>> ");
        return SCANNER.nextDouble();
    }
    public static int getCreditScore() {
        System.out.printf("Enter your credit score:%n>> ");
        return SCANNER.nextInt();
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        return (creditScore >= REQUIRED_CREDIT_SCORE && salary >= REQUIRED_SALARY);
    }
}
