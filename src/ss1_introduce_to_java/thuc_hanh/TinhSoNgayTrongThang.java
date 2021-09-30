package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn cần tính ngày ?");
        month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày !");
                break;
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày !");
                break;
            default:
                System.out.println("Nhập sai tháng !");
                break;
        }

    }
}
