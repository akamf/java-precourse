package chapter3;

import java.util.Scanner;

public class GradeMessage {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String grade, message;

        System.out.printf("Enter your letter grade:%n>> ");
        grade = SCANNER.next();

        message = switch (grade.toUpperCase()) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a little harder!";
            case "F" -> "Uh oh!";
            default -> "Error! Invalid grade";
        };

        System.out.println(message);

        SCANNER.close();
    }

}
