package AngieJones.chapter4;

import java.util.Random;

/*
    The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

    - Roll the die for the user (generate a Random number between 1 - 6) and advance the user
      that number of spaces on the game board. [Code for this is in Independent Exercise section]

    - After each roll, tell the user which game space they are on and how many more spaces they
      have to go to win.

    - Repeat this 4 additional times for 5 rolls in total.

    - However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

    - If they are greater than or less than 20 spaces exactly, they lose.

    - Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
*/

public class RollTheDieGame {
    public static final Random RANDOM = new Random();

    public static final int BOARD_LIMIT = 20;
    public static final int MAX_ROLLS = 5;

    public static void main(String[] args) {
        int currentSpace = 0;

        for (int i = 0; i < MAX_ROLLS; i++) {
            int diceValue = rollDice();
            System.out.printf("You roll a %d %n", diceValue);
            currentSpace += diceValue;

            if (currentSpace == BOARD_LIMIT) {
                System.out.println("Congratulations! YOU WIN!");
                break;
            }
            else if (currentSpace > BOARD_LIMIT) {
                System.out.println("You advanced outside the board. YOU LOSE!");
                break;
            }
            else {
                System.out.printf(
                    "You advanced to space %d and have %d more spaces to win. %n",
                    currentSpace, (BOARD_LIMIT - currentSpace)
                );
            }
        }

        if (currentSpace < BOARD_LIMIT) {
            System.out.println("YOU LOSE! You're out of dice rolls.");
        }
    }

    public static int rollDice() {
        return RANDOM.nextInt(6) + 1;
    }

}
