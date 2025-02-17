package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static final int QUOTA_THRESHOLD = 10;

    public static void main(String[] args) {
        int numSales;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sales you made this week:\n>> ");
        numSales = scanner.nextInt();

        if (numSales >= QUOTA_THRESHOLD) {
            System.out.println("Congratulations! You've met the quota!");
        }
        else {
            int salesShort = QUOTA_THRESHOLD - numSales;
            System.out.printf("Sorry! You did not meet the quota.\nYou missed by %d sales.", salesShort);
        }

        scanner.close();
    }

}
