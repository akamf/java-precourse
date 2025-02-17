package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static final int REQUIRED_SALARY = 30_000;
    public static final int REQUIRED_YEARS_EMPLOYED = 2;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getInput("Enter your salary:");
        double yearsEmployed = getInput("Enter the number of years with your current employer:");

        if (salary >= REQUIRED_SALARY && yearsEmployed >= REQUIRED_YEARS_EMPLOYED) {
            System.out.println("Congratulations! You qualify for a loan.");
        }
        else {
            System.out.println("Sorry! You don't qualify for a loan.\nREASON(S)");
            if (salary < REQUIRED_SALARY) {
                System.out.printf("* You have to earn at least $%d.%n", REQUIRED_SALARY);
            }
            if (yearsEmployed < REQUIRED_YEARS_EMPLOYED) {
                System.out.printf("* You have to work at least %d years at the same company.\n", REQUIRED_YEARS_EMPLOYED);
            }
        }

        SCANNER.close();
    }

    private static double getInput(String prompt) {
        System.out.print(prompt + "\n>> ");
        return SCANNER.nextDouble();
    }

}
