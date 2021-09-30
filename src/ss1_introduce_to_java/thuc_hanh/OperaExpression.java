package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class OperaExpression {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài :");
        height = scanner.nextFloat();
        System.out.println("Nhập chiều rộng :");
        width = scanner.nextFloat();
        area = height * width;
        System.out.println("Diện tích hình chữ nhật là : " + area);
    }
}
