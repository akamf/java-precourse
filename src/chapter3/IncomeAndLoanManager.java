package chapter3;

import java.util.Scanner;

public class IncomeAndLoanManager {
    private final int SALES_BONUS = 250;
    private final int BONUS_THRESHOLD = 10;
    private final int QUOTA_THRESHOLD = 10;
    private final int REQUIRED_SALARY = 30_000;
    private final int REQUIRED_YEARS_EMPLOYED = 2;

    private static Scanner scanner;
    private double salary;
    private int totalSales;
    private int yearsEmployed;

    public IncomeAndLoanManager() {
        scanner = new Scanner(System.in);

        this.salary = getInput("Enter your salary:");
        this.totalSales = (int) getInput("How many sales did the employee make this week?");
        this.yearsEmployed = (int) getInput("Enter the number of years with your current employer:");

        if (totalSales >= BONUS_THRESHOLD) {
            System.out.printf("The employee qualifies for the $%d bonus.\n", SALES_BONUS);
            salary += SALES_BONUS;
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void close() {
        System.out.println("\nClosing Income And Loan Manager");
        scanner.close();
    }

    public boolean qualifiedForLoan() {
        return (salary >= REQUIRED_SALARY && yearsEmployed >= REQUIRED_YEARS_EMPLOYED);
    }

    public void print() {
        System.out.printf("The employee's pay is $%.2f.\n", salary);

        if (qualifiedForLoan()) {
            System.out.println("Congratulations! You qualify for a loan.");
        }
        else {
            System.out.println("Sorry! You don't qualify for a loan.\nREASON(S)");
            if (salary < REQUIRED_SALARY)
                System.out.printf("* You have to earn at least $%d.\n", REQUIRED_SALARY);

            if (yearsEmployed < REQUIRED_YEARS_EMPLOYED)
                System.out.printf("* You have to work at least %d years at the same company.\n", REQUIRED_YEARS_EMPLOYED);

        }

        if (totalSales >= QUOTA_THRESHOLD)
            System.out.println("Congratulations! You've met the quota!");
        else
            System.out.printf("Sorry! You did not meet the quota.%nYou missed by %d sales.", (QUOTA_THRESHOLD - totalSales));
    }

    private static double getInput(String prompt) {
        System.out.print(prompt + "\n>> ");
        return scanner.nextDouble();
    }
}
