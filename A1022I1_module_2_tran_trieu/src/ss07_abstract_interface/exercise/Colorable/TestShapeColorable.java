package ss07_abstract_interface.exercise.Colorable;

public class TestShapeColorable {
    public static void main(String[] args) {
       Square [] squares = new Square[3];
       squares[0]=new Square(5.6);
       squares[1]=new Square();
       squares[2]=new Square(2.0);
        for (Square square:squares) {
            System.out.println(square.getArea());
            square.howToColor();
        }

    }
}
