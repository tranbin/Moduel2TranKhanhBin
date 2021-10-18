package ss7_interface_abstract.bai_tap.Resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Rectangle[] rectangles = new Rectangle[5];
        int length = rectangles.length;
        // init array circle
        for (int i = 0; i < length; i++) {
            rectangles[i] = new Rectangle(10,20);
        }
        // resize
        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area before resize: " + rectangles[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            rectangles[i].resize(percent);
            System.out.println("Area after resize: " + rectangles[i].getArea());
        }
    }
}
