package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] arg) {
        String seasonOfTheYear, adjective;
        int wholeNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a season of the year:\n>> ");
        seasonOfTheYear = scanner.next();

        System.out.print("Enter a whole number:\n>> ");
        wholeNumber = scanner.nextInt();

        System.out.print("Enter a adjective:\n>> ");
        adjective = scanner.next();

        System.out.printf(
            "On a %s %s day, I drink a minimum of %d cups of coffee.%n",
            adjective, seasonOfTheYear, wholeNumber
        );

        scanner.close();
    }

}
