package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước");
            size = Integer.parseInt(sc.nextLine());
            if (size > 30) {
                System.out.println("Kích thước không thể quá 30");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập điểm cho học sinh thứ " + (i + 1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int count = 0;
        System.out.print("Dách sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng học sinh pass là : " + count);

    }
}
