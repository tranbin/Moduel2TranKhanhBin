package ss7_interface_abstract.bai_tap.Colorable;

public class Square extends Shape implements Colorable {

    private double side = 0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area = " +
                + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
