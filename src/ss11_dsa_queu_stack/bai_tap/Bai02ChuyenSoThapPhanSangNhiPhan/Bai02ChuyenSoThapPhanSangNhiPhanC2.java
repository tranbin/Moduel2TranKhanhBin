package ss11_dsa_queu_stack.bai_tap.Bai02ChuyenSoThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Bai02ChuyenSoThapPhanSangNhiPhanC2 {
    public void convertBinary(int num) {

        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0) {

            //thực hiện phép chia lấy phần dư cho 2.

            int d = num % 2;

            // thêm vào stack.

            stack.push(d);

            num /= 2;

        }
        while (!(stack.isEmpty())) {

            System.out.print(stack.pop());

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bạn cần đổi sang nhị phân");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("Hệ nhị phân của " + num + " là :");

        new Bai02ChuyenSoThapPhanSangNhiPhanC2().convertBinary(num);

    }
}
