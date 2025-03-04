package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        String exampleText = "Andreas Kamf SALT Java Fullstack Program Spring 2025";
        countWords(exampleText);
        reverseString(exampleText);
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++)
            System.out.println(words[i]);
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text.charAt(i));
    }
}
