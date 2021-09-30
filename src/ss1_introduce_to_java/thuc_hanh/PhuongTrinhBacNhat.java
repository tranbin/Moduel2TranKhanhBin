package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a, b, c, result;
        System.out.println("Phương trình bậc nhất Ax + B = C");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập A");
        a = scanner.nextDouble();
        System.out.println("Nhập B");
        b = scanner.nextDouble();
        System.out.println("Nhập C");
        c = scanner.nextDouble();
        if (a != 0) {
            result = (c - b) / a;
            System.out.println("Nghiệp của X = " + result);
        } else {
            if (b == c) {
                System.out.println("X có vô số nghiệm");
            } else {
                System.out.println("PT VÔ NGHIỆM");
            }
        }
    }
}
