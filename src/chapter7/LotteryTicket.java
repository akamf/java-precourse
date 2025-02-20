package chapter7;

import java.util.Random;
import java.util.HashSet;

public class LotteryTicket {
    private static final int LOTTERY_NUMBERS = 6;
    private static final int MAX_NUMBER = 69;

    private int[] numbers;

    public LotteryTicket() {
        this.numbers  = new int[LOTTERY_NUMBERS];
        generateUniqueNumbers();
    }

    private void generateUniqueNumbers() {
        Random rand = new Random();
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        int index = 0;
        while (uniqueNumbers.size() < LOTTERY_NUMBERS) {
            int newNumber = rand.nextInt(MAX_NUMBER) + 1;
            if (uniqueNumbers.add(newNumber)) {
                numbers[index++] = newNumber;
            }
        }
    }

    public int[] getNumbers() {
        return numbers.clone();
    }

    public int getNumberFromIndex(int index) {
        return numbers[index];
    }

    public void printNumbers() {
        System.out.println("Your lottery numbers:");
        for (int number : this.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}
