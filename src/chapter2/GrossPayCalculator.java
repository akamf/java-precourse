package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.print("Enter the number of hours the employee worked:\n>> ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter the employees pay rate:\n>> ");
        double payRate = scanner.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.print("The employee's gross pay is: $" + grossPay);

        scanner.close();
    }

}
