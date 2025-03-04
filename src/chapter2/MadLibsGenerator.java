package chapter2;

import java.util.Random;
import java.util.Scanner;

public class MadLibsGenerator {
    private String adjective;
    private String number;
    private String season;

    public MadLibsGenerator() {
        String[] adjectives = {"happy", "sad", "angry", "excited", "nervous", "brave", "lazy", "funny", "serious", "curious"};
        String[] seasons = {"winter", "spring", "summer", "fall"};
        Random random = new Random();

        this.adjective = adjectives[random.nextInt(adjectives.length)];
        this.season = seasons[random.nextInt(seasons.length)];
        this.number = String.valueOf(random.nextInt(10) + 1);
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);

        setAdjective(getInput(scanner, "Enter a adjective"));
        setSeason(getInput(scanner, "Enter a season of the year"));
        setNumber(getInput(scanner, "Enter a whole number"));

        scanner.close();
    }

    public void print() {
        System.out.printf(
            "On a %s %s day, I drink a minimum of %s cups of coffee.%n",
            adjective, season, number
        );
    }

    private static String getInput(Scanner scanner, String prompt) {
        System.out.printf("%s:\n>> ", prompt);
        return scanner.next();
    }
}
