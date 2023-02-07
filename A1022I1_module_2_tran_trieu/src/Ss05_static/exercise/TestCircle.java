package Ss05_static.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle = new Circle(2.0);
        System.out.println(circle.getArea());
    }
}
