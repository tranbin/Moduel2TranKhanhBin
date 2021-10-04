package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai08DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi;
        char check = 'a';
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        chuoi = input.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là " + chuoi);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == check) {
                count = count + 1;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + check + " trong chuỗi " + chuoi + " là : " + count);




    }
}
