package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        String grade, message;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your letter grade:\n>> ");
        grade = scanner.next();

        message = switch (grade.toUpperCase()) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a little harder!";
            case "F" -> "Uh oh!";
            default -> "Error! Invalid grade";
        };

        System.out.println(message);

        scanner.close();
    }

}
