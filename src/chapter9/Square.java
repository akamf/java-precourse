package chapter9;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String shape) {
        System.out.println("This is a " + shape);
    }
}
