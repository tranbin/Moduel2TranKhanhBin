package ss1_introduce_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double tienVN, tienUSD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá tiền để đổi sang VND");
        tienUSD = scanner.nextDouble();
        tienVN = tienUSD * 23000;
        System.out.println("Tỉ giá của tiền " + tienUSD + "$" + " sang VND là " + tienVN + "VND");
    }
}
