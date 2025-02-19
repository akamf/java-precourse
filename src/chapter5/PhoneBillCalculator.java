package chapter5;


/*
    Calculate the final total of someone’s cell phone bill.

    Allow the operator to input the plan fee and the number of overage minutes.

    Charge the user 0.25 for every minute they were over their plan,
    and 15% tax on the subtotal.

    Create separate methods to calculate the tax, overage fees, and final total.

    Print the itemized bill.
*/

import java.util.Scanner;

public class PhoneBillCalculator {
    private static final double OVERAGE_RATE = 0.25;
    private static final double TAX_RATE = 0.15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your monthly plan fee:\n>> ");
        double planFee = scanner.nextDouble();

        System.out.print("Enter the number of overage minutes:\n>> ");
        int overageMinutes = scanner.nextInt();

        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planFee + overageFee);
        double total = calculateTotal(planFee, overageFee, tax);

        printBill(planFee, overageFee, tax, total);

        scanner.close();
    }

    private static double calculateOverageFee(int minutes) {
        return minutes * OVERAGE_RATE;
    }

    private static double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    private static double calculateTotal(double planFee, double overageFee, double tax) {
        return planFee + overageFee + tax;
    }

    private static void printBill(double planFee, double overageFee, double tax, double total) {
        System.out.println("\n--- Itemized Phone Bill ---");
        System.out.printf("Plan Fee: $%.2f%n", planFee);
        System.out.printf("Overage Fee: $%.2f%n", overageFee);
        System.out.printf("Tax (15%%): $%.2f%n", tax);
        System.out.printf("Total Bill: $%.2f%n", total);
    }
}
