package chapter3;

import java.util.Scanner;

public class IncomeAndLoanManager {
    private static final int BASE_SALARY = 1000;
    private static final int SALES_BONUS = 250;
    private static final int BONUS_THRESHOLD = 10;

    private static final Scanner SCANNER = new Scanner(System.in);

    private int salary;

    public IncomeAndLoanManager() {
        this.salary = BASE_SALARY;
    }

    public IncomeAndLoanManager(int salary) {
        this.salary = salary;
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

    public void print() {
        System.out.printf("The employee's pay is $%d.\n", salary);
    }

    private static double getInput(String prompt) {
        System.out.print(prompt + "\n>> ");
        return SCANNER.nextDouble();
    }
}
