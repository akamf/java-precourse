package chapter2;


public class ChapterTwoMain {
    public static void main(String[] args) {
        //MadLibsGenerator madLibsGenerator = new MadLibsGenerator();

        //System.out.println("\n---DEFAULT GENERATED MAD LIBS---");
        //madLibsGenerator.print();

        //madLibsGenerator.create();
        //System.out.println("\n---USER GENERATED MAD LIBS---");
        //madLibsGenerator.print();

        double grossPay = GrossPayCalculator.calculate();
        System.out.print("The employee's gross pay is: $" + grossPay);
    }
}
