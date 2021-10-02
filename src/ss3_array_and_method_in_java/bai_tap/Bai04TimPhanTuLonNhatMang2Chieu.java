package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai04TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng 2 chiều");
        m = input.nextInt();
        System.out.println("Nhập vào sl phần tử mảng con");
        n = input.nextInt();
        int c[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" Mảng C = " + i + "-" + j);
                c[i][j] = input.nextInt();
            }
        }
        int cMax = c[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cMax < c[i][j]) {
                    cMax = c[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong 2 mảng : " + cMax);

    }
}
