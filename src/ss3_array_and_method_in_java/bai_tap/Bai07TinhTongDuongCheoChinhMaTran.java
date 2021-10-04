package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai07TinhTongDuongCheoChinhMaTran {
    /*
    * Viết một ứng dụng cho phép người dùng nhập vào một ma trận vuông của các số thực,
    *  sau đó tính ra cho người dùng tổng của các số ở đường chéo chính.

          Ma trận vuông là một ma trận có chiều cao và chiều rộng bằng nhau.

        Đường chéo chính là tập hợp các phần tử được định vị bằng tọa độ [i][i].
    * */
    public static void main(String[] args) {
        int n;
        int sum = 0;
        String text = "\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng và cột của ma trận vuông");
        n = Integer.parseInt(sc.nextLine());
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Mảng 2 chiều ma trận vuông với phẩn tử " + i + "-" + j + " là :");
                array[i][j] = Integer.parseInt(sc.nextLine());
                text = text + array[i][j] + " ";
            }
            text = text + "\n";
        }
        System.out.println("Mảng bạn vừa nhập là :" + text);
        for (int i = 0 ; i < n; i ++){
            for (int j = 0 ; j < n ; j ++){
                    sum+= array[i][j];
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính của ma trận vuông là : " + sum);

    }

}
