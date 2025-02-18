package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double num1, num2, sum;
        boolean runAgain = false;
        String inputChar = "N";

        do {
            System.out.printf("Enter the first number:%n>> ");
            num1 = SCANNER.nextDouble();

            System.out.printf("Enter the second number:%n>> ");
            num2 = SCANNER.nextDouble();

            sum = num1 + num2;
            System.out.printf(
                "The sum of %f and %f is %f. Do you want to run again? (Y/N)%n>> ",
                num1, num2, sum
            );
            inputChar = SCANNER.next();

            runAgain = inputChar.equalsIgnoreCase("Y");

        } while (runAgain);

        SCANNER.close();
    }

}
