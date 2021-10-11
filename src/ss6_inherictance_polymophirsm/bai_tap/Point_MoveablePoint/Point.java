package ss6_inherictance_polymophirsm.bai_tap.Point_MoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
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
        return "X : " + getX() + " Y : " +getY();
    }
}
