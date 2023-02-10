package ss07_abstract_interface.exercise.resizeable_shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }


    public double getAreaChange() {
        int increase = (int) (Math.random() * 101);
        resize(increase);
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +";"+
                "area of the original circle:"+getArea()+";"+
                "area of circle after increasing:"+getAreaChange()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent/100;
    }
}
