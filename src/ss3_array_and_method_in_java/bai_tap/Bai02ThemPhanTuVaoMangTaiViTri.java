package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai02ThemPhanTuVaoMangTaiViTri {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào số bạn cần thêm");
        int so = nhap.nextInt();
        System.out.println("Nhập vào vị trí mà bạn cần thêm số ");
        int viTri = nhap.nextInt();

        for (int i = a.length;i > viTri;i--){
            a[i] = a[i-1];
        }
        a[viTri] = so;

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }


}

