package ss07_abstract_interface.exercise.Colorable;

public class Square implements Colorable{
    private double squareEdge;
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
