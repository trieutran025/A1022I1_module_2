package ss05_static.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = getRadius() * getRadius() * Math.PI;
        return area;
    }

    public double getArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }
}

