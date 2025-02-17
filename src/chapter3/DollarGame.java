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

    public static void main(String[] args) {
        int totalValue = 0;
        int numPennies, numNickels, numDimes, numQuarters;
        String losingMessage;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of pennies:\n>> ");
        numPennies = scanner.nextInt();
        totalValue += numPennies * PENNY_CENT_VALUE;

        System.out.print("Enter the number of nickels:\n>> ");
        numNickels = scanner.nextInt();
        totalValue += numNickels * NICKEL_CENT_VALUE;

        System.out.print("Enter the number of dimes:\n>> ");
        numDimes = scanner.nextInt();
        totalValue += numDimes * DIME_CENT_VALUE;

        System.out.print("Enter the number of quarters:\n>> ");
        numQuarters = scanner.nextInt();
        totalValue += numQuarters * QUARTER_CENT_VALUE;

        if (totalValue == DOLLAR_CENT_VALUE)
            System.out.println("Congratulations, you win!");
        else {
            losingMessage = "Sorry, you lose! ";

            if (totalValue < DOLLAR_CENT_VALUE)
                losingMessage += String.format("You are %d cents under the dollar.", (DOLLAR_CENT_VALUE - totalValue));
            else
                losingMessage += String.format("You are %d cents over the dollar.", (totalValue - DOLLAR_CENT_VALUE));

            System.out.println(losingMessage);
        }

        scanner.close();
    }

}
