package ss07_abstract_interface.exercise.resizeable_shape;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * this.getLength();
    }


    public double getAreaChange() {
        int increase = (int) (Math.random() * 101);
        resize(increase);
        return getWidth() * getLength();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width + ";" +
                "length=" + length + ";" +
                "area of the original rectangle:" + getArea() + ";" +
                "area of rectangle after increasing:" + getAreaChange() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * percent / 100;
        this.length = this.length + this.length * percent / 100;
    }
}
