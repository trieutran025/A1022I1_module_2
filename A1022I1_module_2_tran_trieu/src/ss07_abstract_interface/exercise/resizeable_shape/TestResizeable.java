package ss07_abstract_interface.exercise;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(3.0);
        shapes[1]=new Rectangle(3.5,6.3);
        shapes[2]=new Square(5.2);
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
