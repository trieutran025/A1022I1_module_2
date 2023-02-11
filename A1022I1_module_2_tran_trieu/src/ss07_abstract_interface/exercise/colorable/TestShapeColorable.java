package ss07_abstract_interface.exercise.colorable;

public class TestShapeColorable {
    public static void main(String[] args) {
       Square [] squares = new Square[3];
       squares[0]=new Square(5.6,"Blue");
       squares[1]=new Square(10.0);
       squares[2]=new Square(2.0,"Green");
        for (Square square:squares) {
            System.out.println(square);
            if(square.getColor()!=null){
                square.howToColor();
            }
        }

    }
}
