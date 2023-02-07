package Ss06_inheritance.exercise.Ex2_Point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(1.0F,1.0F,1.0F);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }


    public float[] getXYZ() {
       float [] arrPoint3D = {getX(),getZ(),getZ()};
       return arrPoint3D;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "z=" + getZ() +
                '}';
    }
}
