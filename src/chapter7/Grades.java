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

    public int getHighestGrade() {
        int high = grades[0];

        for (int grade : grades) {
            if (grade > high)
                high = grade;
        }

        return high;
    }

    public int getLowestGrade() {
        int low = grades[0];

        for (int grade : grades) {
            if (grade < low)
                low = grade;
        }

        return low;
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

        for (int grade : grades)
            sum += grade;

        return sum;
    }

    public double calculateAverage() {
        return (double) calculateSum() / grades.length;
    }

    public void printGrades() {
        System.out.printf("%nYou have submitted %d grades.%n", grades.length);
        System.out.printf("Your highest grade: %d%n", getHighestGrade());
        System.out.printf("Your lowest grade: %d%n", getLowestGrade());
        System.out.printf("Average: %.2f %n", calculateAverage());
    }
}
