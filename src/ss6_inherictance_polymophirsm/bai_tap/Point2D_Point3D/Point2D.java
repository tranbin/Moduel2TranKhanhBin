package ss6_inherictance_polymophirsm.bai_tap.Point2D_Point3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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
        float[] test = new float[2];
        test[0] = this.x;
        test[1] = this.y;
        return test;
    }

    @Override
    public String toString() {
        return this.x + " - " + this.y;
    }
}
