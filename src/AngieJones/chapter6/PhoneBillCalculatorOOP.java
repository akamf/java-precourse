package AngieJones.chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneBill defaultBill = new PhoneBill();
        defaultBill.printBill();

        System.out.print("Enter Customer ID:\n>> ");
        int id = scanner.nextInt();

        PhoneBill billWithOnlyId = new PhoneBill(id);
        billWithOnlyId.printBill();

        System.out.print("Enter Customer ID:\n>> ");
        id = scanner.nextInt();

        System.out.print("Enter your monthly plan fee:\n>> ");
        double baseCost = scanner.nextDouble();

        System.out.print("Enter the number of allotted minutes:\n>> ");
        int allottedMinutes = scanner.nextInt();

        System.out.print("Enter the number of minutes used:\n>> ");
        int minutesUsed = scanner.nextInt();

        PhoneBill billWithOverload = new PhoneBill(id, baseCost, allottedMinutes, minutesUsed);
        billWithOverload.printBill();

        scanner.close();
    }
}
