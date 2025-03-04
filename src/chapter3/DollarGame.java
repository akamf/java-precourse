package chapter3;

import java.util.Scanner;

/*
    The objective of the game is to enter enough change to equal exactly $1!
    Create a program that asks a user to enter the quantities for the following coins:
    pennies, nickels, dimes, and quarters.
    Your program should count up the value of all the change.
    If it’s exactly $1, they win!
    If it’s more than $1, tell them by how much they went over.
    If it’s less than $1, tell them by how much they went under.
    Feel free to change the game for your country’s currency!
*/

public class DollarGame {
    public static final int PENNY_CENT_VALUE = 1;
    public static final int NICKEL_CENT_VALUE = 5;
    public static final int DIME_CENT_VALUE = 10;
    public static final int QUARTER_CENT_VALUE = 25;
    public static final int DOLLAR_CENT_VALUE = 100;

    public static void run() {
        int totalDollarValue = calculateTotal();

        if (totalDollarValue == DOLLAR_CENT_VALUE)
            System.out.println("Congratulations, you win!");
        else {
            int difference = Math.abs(DOLLAR_CENT_VALUE - totalDollarValue);

            String message = (totalDollarValue < DOLLAR_CENT_VALUE) ?
                String.format("You are %d cents under the dollar.", difference) :
                String.format("You are %d cents over the dollar.", difference);
            System.out.println("Sorry, you lose! " + message);
        }
    }

    private static int calculateTotal() {
        Scanner scanner = new Scanner(System.in);
        int totalValue = 0;

        totalValue += getCoinCount(scanner, "pennies") * PENNY_CENT_VALUE;
        totalValue += getCoinCount(scanner, "nickels") * NICKEL_CENT_VALUE;
        totalValue += getCoinCount(scanner, "dimes") * DIME_CENT_VALUE;
        totalValue += getCoinCount(scanner, "quarters") * QUARTER_CENT_VALUE;

        scanner.close();

        return totalValue;
    }

    private static int getCoinCount(Scanner scanner, String coinType) {
        System.out.printf("Enter the number of %s:\n>> ", coinType);
        return scanner.nextInt();
    }

}
