package ss07_abstract_interface.exercise.Colorable;

public class Square implements Colorable {
    private double squareEdge;

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square() {
    }

    public Square(double squareEdge) {
        this.squareEdge = squareEdge;
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

    @Override
    public String toString() {
        return "Square{" +
                "squareEdge=" + squareEdge +";"+
                "Area of Square"+getArea()+
                '}';
    }
}
