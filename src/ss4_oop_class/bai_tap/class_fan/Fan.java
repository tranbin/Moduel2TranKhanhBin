package ss4_oop_class.bai_tap.class_fan;

public class Fan {
    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * @return
     */
    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String statusFan = "";
        if (this.isOn()){
            statusFan+= ("Fan is on \n");
            statusFan += ("Speed : " + this.speed + " Color : " + this.color + "Radius : " + this.radius);
        }else {
            statusFan+= ("Fan is off \n");
            statusFan += ("Speed : " + this.speed + " Color : " + this.color + "Radius : " + this.radius);
        }
        return  statusFan;
    }
}
