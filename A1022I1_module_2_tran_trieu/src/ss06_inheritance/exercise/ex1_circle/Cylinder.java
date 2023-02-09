package Ss06_inheritance.exercise.ex1_circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height=1.0;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume = 2 * Math.PI * getRadius() * getHeight();
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius =" + getRadius() +
                "height ="+getHeight() +
                ", color ='" + getColor() + '\'' +
                '}';
    }
}
