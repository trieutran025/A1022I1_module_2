package Ss06_inheritance.exercise.ex2_point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(1.0F, 1.0F, 1.0F);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }


    public float[] getXYZ() {
        float[] arrPoint3D = {getX(), getY(), getZ()};
        return arrPoint3D;
    }

    @Override
    public String toString() {
        return "arrPoint3D= {" + getX() + "," +
                getY() + "," + getZ()
                +
                '}';
    }
}
