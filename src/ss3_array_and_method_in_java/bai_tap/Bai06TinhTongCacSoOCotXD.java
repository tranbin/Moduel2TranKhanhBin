package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai06TinhTongCacSoOCotXD {
    public static void main(String[] args) {
        int m;
        int n;
        String text = "\n";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng 2 chiều");
        m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào sl phần tử mảng con");
        n = Integer.parseInt(input.nextLine());
        int c[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" Mảng C = " + i + "-" + j);
                c[i][j] = Integer.parseInt(input.nextLine());
                text = text + c[i][j] + " ";
            }
            text = text + "\n";
        }
        System.out.println("Mảng bạn vừa nhập là :" + text);
        System.out.println("-------------------------------------");
        System.out.println("Nhập vào cột mà bạn muốn tính");
        int cal = input.nextInt();
        int sum = 0;
        for (int a = 0; a < c.length; a++) {
            sum += c[a][cal];
        }
        System.out.println("Sum của cột mà bạn muốn tính là " + sum);
    }
}
