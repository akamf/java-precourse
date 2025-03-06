package chapter9;

public class ChapterSevenMain {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person("Andreas");
//        Employee employee = new Employee();

//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print();
//        square.print("Square");

        Mother mom = new Mother();
        mom.setName("Mega-Mom");
        System.out.println(mom.getName() + "'s gender is " + mom.getGender());
    }
}
