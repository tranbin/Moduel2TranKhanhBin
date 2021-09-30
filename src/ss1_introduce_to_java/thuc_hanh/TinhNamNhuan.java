package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner nhapNam = new Scanner(System.in);
        System.out.println("Nhập năm bạn cần tính nhuận hay không ?");
        nam = nhapNam.nextInt();
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0) {
                    System.out.println(nam + " là năm nhuận");
                } else {
                    System.out.println(nam + "là năm không nhuận");
                }
            } else {
                System.out.println(nam + " là năm nhuận");
            }
        } else {
            System.out.println(nam + " là năm không nhuận");
        }
    }
}
