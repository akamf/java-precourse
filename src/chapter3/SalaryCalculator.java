package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static final int BASE_SALARY = 1000;
    public static final int SALES_BONUS = 250;
    public static final int BONUS_THRESHOLD = 10;

    public static void main(String[] args) {
        int totalSales;
        int salary = BASE_SALARY;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many sales did the employee make this week?\n>> ");
        totalSales = scanner.nextInt();

        if (totalSales > BONUS_THRESHOLD) {
            salary += SALES_BONUS;
        }

        System.out.printf("The employee's pay is $%d", salary);
        scanner.close();
    }

}
