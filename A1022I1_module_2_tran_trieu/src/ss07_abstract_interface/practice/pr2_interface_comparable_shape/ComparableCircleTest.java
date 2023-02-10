package ss07_abstract_interface.practice.pr2_interface_comparable_shape;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[1]=new ComparableCircle();

        System.out.println("Pre-sorted :");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
