package ss7_interface_abstract.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        for (int i = 0; i < 3; i++) {
            shape[i] = getRandomShape();
            System.out.println();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }

    }

    static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10, 20);
            default:
                return new Circle(10);
        }
    }
}
