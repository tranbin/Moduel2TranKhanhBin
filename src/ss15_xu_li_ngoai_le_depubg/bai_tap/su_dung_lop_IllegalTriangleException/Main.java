package ss15_xu_li_ngoai_le_depubg.bai_tap.su_dung_lop_IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,5);
        double perimeter = triangle.perimeter();
        System.out.println("Tổng của 3 cạnh là : " +perimeter);
    }
}
