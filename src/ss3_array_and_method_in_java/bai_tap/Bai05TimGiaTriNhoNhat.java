package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai05TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng");
        n = Integer.parseInt(sc.nextLine());
        int[] mang = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            mang[i] = sc.nextInt();
        }
        for (int element:mang){
            System.out.println(element);
        }
        int min = mang[0];
        for (int j = 0 ; j < mang.length;j++){
            if (min>mang[j]){
                min = mang[j];
            }
        }
        System.out.println("Gía trị nhỏ nhất là " + min);
    }
}
