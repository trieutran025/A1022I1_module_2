package ss07_abstract_interface.exercise.resizeable_shape;

public class Square extends Shape implements Resizeable {
    private double squareEdge = 1.0;

    public Square() {
    }

    public Square(double width) {
        this.squareEdge = width;
    }

    public double getSquareEdge() {
        return squareEdge;
    }

    public void setSquareEdge(double squareEdge) {
        this.squareEdge = squareEdge;
    }

    public double getArea() {
        return getSquareEdge() * getSquareEdge();
    }
    public double getAreaChange() {
        int increase = (int) (Math.random() * 101);
        resize(increase);
        return getSquareEdge() * getSquareEdge();
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareEdge=" + squareEdge +";"+
                "area of the original Square:"+getArea()+";"+
                "area of square after increasing:"+getAreaChange()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.squareEdge*=percent/100;
    }
}
