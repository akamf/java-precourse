package chapter3;

import java.util.Scanner;

public class LoanQualifer {
    public static final int REQUIRED_SALARY = 30_000;
    public static final int REQUIRED_YEARS_EMPLOYED = 2;

    public static void main(String[] args) {
        double salary, yearsEmployed;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary:\n>> ");
        salary = scanner.nextDouble();

        System.out.print("Enter the number of years with your current employer:\n>> ");
        yearsEmployed = scanner.nextDouble();

        if (salary >= REQUIRED_SALARY && yearsEmployed >= REQUIRED_YEARS_EMPLOYED) {
            System.out.println("Congratulations! You qualify for a loan.");
        }
        else {
            System.out.println("Sorry! You don't qualify for a loan.\nREASON(S)");
            if (salary < REQUIRED_SALARY) {
                System.out.printf("* You have to earn at least $%d.\n", REQUIRED_SALARY);
            }
            if (yearsEmployed < REQUIRED_YEARS_EMPLOYED) {
                System.out.printf("* You have to work at least %d years at the same company.\n", REQUIRED_YEARS_EMPLOYED);
            }
        }

        scanner.close();
    }

}
