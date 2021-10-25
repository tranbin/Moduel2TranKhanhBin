package ss11_dsa_queu_stack.bai_tap.Bai02ChuyenSoThapPhanSangNhiPhan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        ConvertNumber convertNumber = new ConvertNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bạn cần đổi sang hệ nhị phân");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Mã hóa số " +num + " sang hệ nhị phân là :");
        convertNumber.convertBinary(num);
    }
}
