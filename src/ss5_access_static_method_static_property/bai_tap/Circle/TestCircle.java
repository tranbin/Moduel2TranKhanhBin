package ss5_access_static_method_static_property.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        System.out.println("Area : " + circle.getArea());
    }
}
