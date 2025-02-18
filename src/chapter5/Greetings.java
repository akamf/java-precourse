package chapter5;

import java.util.Scanner;

public class Greetings {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name;

        System.out.printf("Enter your name:%n>> ");
        name = SCANNER.next();

        greet(name);

        SCANNER.close();
    }

    public static void greet(String inputName) {
        System.out.printf("Hello %s!", inputName);
    }

}
