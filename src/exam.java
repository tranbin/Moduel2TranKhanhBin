import java.util.Scanner;

public class exam {
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
        System.out.println("Nhập vào cột mà bạn muốn tính");
        int cal = input.nextInt();
        int sum = 0;
        for (int a = 0; a < c.length; a++) {
            sum += c[a][cal];
        }
        System.out.println("Sum của cột mà bạn muốn tính là " + sum);
    }

}
