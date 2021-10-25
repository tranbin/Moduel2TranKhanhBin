package ss11_dsa_queu_stack.bai_tap.Bai02ChuyenSoThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Bai02ChuyenSoThapPhanSangNhiPhanC1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân: ");
        num = Integer.parseInt(input.nextLine());
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num = num / 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
