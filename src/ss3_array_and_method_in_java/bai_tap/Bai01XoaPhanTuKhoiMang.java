package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai01XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số cần phải xóa khỏi mảng");
        int so = nhap.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (so == numbers[i]) {
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j] + 1;
                }
                numbers[numbers.length - 1] = 0;
                i--;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

    }
}
