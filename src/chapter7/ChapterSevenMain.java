package chapter7;

import java.util.Scanner;

public class ChapterSevenMain {
    public static void main(String[] args) {
        //LotteryTicket ticket = new LotteryTicket();
        //ticket.printNumbers();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many grades do you want to enter?\n>> ");
        Grades grades = new Grades(scanner.nextInt());
        grades.printGrades();
    }
}
