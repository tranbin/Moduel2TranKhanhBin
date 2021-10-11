package ss6_inherictance_polymophirsm.bai_tap.Point_MoveablePoint;

public class MoveablePoint extends Point {
    private float XSpeed ;
    private float YSpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float XSpeed, float YSpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public MoveablePoint(float x, float y, float XSpeed, float YSpeed) {
        super(x, y);
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }
    public void setSpeed(float XSpeed, float YSpeed){
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public float[] getSpeed(){
        float[] test = new float[2];
        test[0] = this.XSpeed;
        test[2] = this.YSpeed;
        return  test;
    }

    @Override
    public String toString() {
        return "X : " +getX() + " Y : " + getY() + " speed " + " = " + getXSpeed() + "-" + getYSpeed();
    }
    public MoveablePoint move(){
        this.setX(this.getX() + this.XSpeed);
        this.setY(this.getY() + this.YSpeed);
        return this;
    }
}
