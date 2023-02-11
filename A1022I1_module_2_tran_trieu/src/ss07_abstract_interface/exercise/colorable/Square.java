package ss07_abstract_interface.exercise.colorable;

public class Square implements Colorable {
    private double squareEdge;
    private String color;
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(double squareEdge, String color) {
        this.squareEdge = squareEdge;
        this.color = color;
    }

    public Square(String color) {
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareEdge=" + squareEdge +";"+
                "Area of Square="+getArea()+
                '}';
    }
}
