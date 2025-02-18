package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static final int HOURLY_RATE = 15;
    public static final int MAX_WEEKLY_WORK_HOURS = 40;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double hoursWorked = 0.0;

        System.out.printf("How many hours did you work this week?%n>> ");
        hoursWorked = SCANNER.nextDouble();

        while (hoursWorked < 1 || hoursWorked > MAX_WEEKLY_WORK_HOURS) {
            System.out.printf("Invalid entry. Your hours must between 1 and 40. Try again!%n>> ");
            hoursWorked = SCANNER.nextDouble();
        }

        SCANNER.close();

        double grossPay = HOURLY_RATE * hoursWorked;
        System.out.printf("Gross pay: %f%n", grossPay);
    }
}
