package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhLaiChoVay {
    public static void main(String[] args) {
        double soTien = 1.0 ;
        int soThang = 1 ;
        double laiXuat = 1.0 ;
        double laiNhan  = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn cho vay");
        soTien = input.nextDouble();
        System.out.println("Nhập số tháng mà bạn cho vay ?");
        soThang = input.nextInt();
        System.out.println("Nhập lãi xuất mà bạn đã chọn");
        laiXuat = input.nextDouble();
        for (int i = 0; i < soThang; i ++){
            laiNhan += soTien * (laiXuat/100)/12 * soThang;
        }
        System.out.println("Lãi cho vay của bạn là : " + laiNhan);
    }
}
