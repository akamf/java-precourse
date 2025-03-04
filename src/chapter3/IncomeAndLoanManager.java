package chapter3;

import java.util.Scanner;

public class IncomeAndLoanManager {
    public enum Category {
        SALARY,
        LOAN
    }

    private static final int SALES_BONUS = 250;
    private static final int BONUS_THRESHOLD = 10;
    public static final int REQUIRED_SALARY = 30_000;
    public static final int REQUIRED_YEARS_EMPLOYED = 2;

    private static final Scanner SCANNER = new Scanner(System.in);

    private double salary;
    private int yearsEmployed;

    public IncomeAndLoanManager() {
        this.salary = getInput("Enter your salary:");
        this.yearsEmployed = (int) getInput("Enter the number of years with your current employer:");;
    }

    public double getSalary() {
        return this.salary;
    }

    public void close() {
        System.out.println("Closing Income And Loan Manager");
        SCANNER.close();
    }

    public void calculateSalary() {
        int totalSales = (int) getInput("How many sales did the employee make this week?");

        if (totalSales >= BONUS_THRESHOLD) {
            System.out.printf("The employee qualifies for the $%d bonus.\n", SALES_BONUS);
            salary += SALES_BONUS;
        }
    }

    public boolean qualifiedForLoan() {
        return (salary >= REQUIRED_SALARY && yearsEmployed >= REQUIRED_YEARS_EMPLOYED);
    }

    public void print(Category cat) {
        switch (cat) {
            case SALARY:
                System.out.printf("The employee's pay is $%.2f.\n", salary);
                break;
            case LOAN:
                if (qualifiedForLoan()) {
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
        }
    }

    private static double getInput(String prompt) {
        System.out.print(prompt + "\n>> ");
        return SCANNER.nextDouble();
    }
}
