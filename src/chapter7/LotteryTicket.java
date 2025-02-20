package chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LOTTERY_NUMBERS = 6;
    private static final int MAX_NUMBER = 69;

    private int[] numbers;

    public LotteryTicket() {
        this.numbers  = new int[LOTTERY_NUMBERS];
        generateNumbers();
    }

    private void generateNumbers() {
        Random rand = new Random();
        for (int i = 0; i < LOTTERY_NUMBERS; i++)
            numbers[i] = rand.nextInt(MAX_NUMBER) + 1;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int gettNumberFromIndex(int index) {
        return numbers[index];
    }
}
