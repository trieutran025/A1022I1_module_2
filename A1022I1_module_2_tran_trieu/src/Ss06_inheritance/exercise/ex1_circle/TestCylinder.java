package Ss06_inheritance.exercise.Ex1_cricle;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle=new Circle(2.0,"Blue");
        System.out.println(circle);

        System.out.println("Area of Circle :"+circle.getArea());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.0, 2.0, "Red");
        System.out.println(cylinder);

        System.out.println("Volume of Cylinder :"+cylinder.getVolume());
    }
}
