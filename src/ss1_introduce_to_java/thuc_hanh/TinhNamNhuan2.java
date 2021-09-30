package ss1_introduce_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhNamNhuan2 {
    public static void main(String[] args) {
        int nam;
        Scanner nhapNam = new Scanner(System.in);
        System.out.println("Nhập năm");
        nam = nhapNam.nextInt();
        boolean kiemTra = false;
        boolean chiaHet4 = nam % 4 == 0;
        if (chiaHet4) {
            boolean chiaHet100 = nam % 100 == 0;
            if (chiaHet100) {
                boolean chiaHet400 = nam % 400 == 0;
                if (chiaHet400) {
                    kiemTra = true;
                }
            } else {
                kiemTra = true;
            }
        }
        if (kiemTra) {
            System.out.println(nam + " là năm nhuận");
        } else {
            System.out.println(nam + " là năm không nhuận");
        }
    }
}
