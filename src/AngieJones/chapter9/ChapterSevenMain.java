package AngieJones.chapter9;

public class ChapterSevenMain {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person("Andreas");
//        Employee employee = new Employee();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print();
//        square.print("Square");
//
//        Mother mom = new Mother();
//        mom.setName("Mega-Mom");
//        System.out.println(mom.getName() + "'s gender is " + mom.getGender());

        Cake basicCake = new Cake();
        basicCake.setFlavor("strawberry");
        basicCake.setPrice(9.99);
        System.out.println("Basic Cake Information");
        System.out.println("Flavor: " + basicCake.getFlavor() + "\nPrice: $" + basicCake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("chocolate");
        birthdayCake.setPrice(11.99);
        birthdayCake.setCandles(33);
        System.out.println("\nBirthday Cake Information");
        System.out.println("Flavor: " + birthdayCake.getFlavor() + "\nPrice: $" + birthdayCake.getPrice() + "\nNumber of candles: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("lemon meringue");
        weddingCake.setPrice(24.99);
        weddingCake.setTiers(3);
        System.out.println("\nWedding Cake Information");
        System.out.println("Flavor: " + weddingCake.getFlavor() + "\nPrice: $" + weddingCake.getPrice() + "\nNumber of tiers: " + weddingCake.getTiers());
    }
}
