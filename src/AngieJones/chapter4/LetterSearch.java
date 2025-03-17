package AngieJones.chapter4;

import java.util.Scanner;

public class LetterSearch {
    public  static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        boolean letterFound = false;

        System.out.printf("Enter some text:%n>> ");
        text = SCANNER.next();

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound)
            System.out.println("The text contains the letter A");
        else
            System.out.println("The text doesn't contain the letter A");

        SCANNER.close();
    }

}
