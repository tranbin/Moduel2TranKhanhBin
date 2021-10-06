package ss4_oop_class.thuc_hanh;

public class Retangle {
    double height,width;
    public Retangle(){
    }
    public Retangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
