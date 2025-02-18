package chapter4;

import java.util.Scanner;

public class Cashier {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int quantity = 0;
        double total = 0.0;

        System.out.printf("Enter the number of items you would like to scan:%n>> ");
        quantity = SCANNER.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Enter the cost of the item:%n>> ");
            double price = SCANNER.nextDouble();

            total += price;
        }

        System.out.printf("The total sum of the %d items is $%.2f.", quantity, total);

        SCANNER.close();
    }
}
