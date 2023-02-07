package Ss06_inheritance.exercise.Ex2_Point;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point2D point2D =new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5.0F,6.0F);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D=new Point3D((float) 5.1F,2.6F,3.7F);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
