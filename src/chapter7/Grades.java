package chapter7;

import java.util.Scanner;

public class Grades {
    private int[] grades;

    public Grades(int numGrades) {
        this.grades = new int[numGrades];
        addGrades();
    }

    public int[] getGrades() {
        return grades.clone();
    }

    public void addGrades() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Enter grade #%d:%n>> ", (i+1));
            this.grades[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public int calculateSum() {
        int sum = 0;

        for (int grade : getGrades())
            sum += grade;

        return sum;
    }

    public double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public void printGrades() {
        System.out.println("Your grades:");
        for (int number : this.getGrades()) {
            System.out.print(number + " ");
        }
        System.out.printf("%nAverage: %.2f %n", calculateAverage());
    }
}
