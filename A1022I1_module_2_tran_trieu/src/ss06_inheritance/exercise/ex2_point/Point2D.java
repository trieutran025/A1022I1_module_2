package ss06_inheritance.exercise.ex2_point;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(1.0F,1.0F);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arrPoint2D = {x, y};
        return arrPoint2D;
    }

    @Override
    public String toString() {
        return "arrPoint2D= {" + getX()+","
                +getY()
                + '}';
    }
}
