package chapter3;

public class ChapterThreeMain {
    public static void main(String[] args) {
        //TestResults.getTestResult();
        //DollarGame.run();
        IncomeAndLoanManager manager = new IncomeAndLoanManager();
        manager.calculateSalary();
        manager.print();
        manager.close();
    }
}
