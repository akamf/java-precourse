package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static final int QUOTA_THRESHOLD = 10;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int numSales;

        System.out.printf("Enter the number of sales you made this week:%n>> ");
        numSales = SCANNER.nextInt();

        if (numSales >= QUOTA_THRESHOLD) {
            System.out.println("Congratulations! You've met the quota!");
        }
        else {
            int salesShort = QUOTA_THRESHOLD - numSales;
            System.out.printf("Sorry! You did not meet the quota.%nYou missed by %d sales.", salesShort);
        }

        SCANNER.close();
    }

}
