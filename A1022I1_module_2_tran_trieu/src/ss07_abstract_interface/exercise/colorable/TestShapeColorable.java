package ss07_abstract_interface.exercise.colorable;

public class TestShapeColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.2);
        shapes[1] = new Rectangle(5.1, 5.6);
        shapes[2] = new Square(5.2);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }

    }
}
