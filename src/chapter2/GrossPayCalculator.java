package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static double calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours the employee worked:\n>> ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter the employee's pay rate:\n>> ");
        double payRate = scanner.nextDouble();

        scanner.close();

        return hoursWorked * payRate;
    }
}
