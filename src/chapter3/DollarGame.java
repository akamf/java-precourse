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

    public static void main(String[] args) {
        int totalValue, numPennies, numNickels, numDimes, numQuarters;
        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

}
