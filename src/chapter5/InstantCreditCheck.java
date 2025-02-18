package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    public static final int REQUIRED_SALARY = 25_000;
    public static final int REQUIRED_CREDIT_SCORE = 700;

    static int creditScore = 0;
    static double salary = 0;

    public static void main(String[] args) {
        getFormData();

        if (isUserQualified())
            System.out.println("Congratulations! You qualify for a loan.");
        else
            System.out.println("Sorry! You don't qualify.");
    }

    public static void getFormData() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your salary:%n>> ");
        salary = scanner.nextDouble();

        System.out.printf("Enter your credit score:%n>> ");
        creditScore = scanner.nextInt();

        scanner.close();
    }

    public static boolean isUserQualified() {
        return (creditScore >= REQUIRED_CREDIT_SCORE && salary >= REQUIRED_SALARY);
    }
}
