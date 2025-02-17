package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        String grade, message;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your letter grade:\n>> ");
        grade = scanner.next();

        switch (grade.toUpperCase()) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a little harder!";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error! Invalid grade";
                break;
        }

        System.out.println(message);

        scanner.close();
    }

}
