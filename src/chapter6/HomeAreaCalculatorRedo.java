package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle kitchen = getRoom("kitchen");
        Rectangle bathroom = getRoom("bathroom");

        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The combined area for the kitchen and the bathroom is " + area);
        SCANNER.close();
    }

    public static Rectangle getRoom(String roomType) {
        double length = handleInput("length", roomType);
        double width = handleInput("width", roomType);
        return new Rectangle(length, width);
    }

    public static double handleInput(String param, String room) {
        System.out.printf("Enter the %s of your %s:%n>> ", param, room);
        double val = SCANNER.nextDouble();

        return val;
    }

    public static double calculateTotalArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
