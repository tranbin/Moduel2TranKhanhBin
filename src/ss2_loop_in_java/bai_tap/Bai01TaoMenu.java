package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class Bai01TaoMenu {
    public static void main(String[] args) {
        int luaChon = -1;
        Scanner input = new Scanner(System.in);
        while (luaChon != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông ở góc trái dưới");
            System.out.println("3. In hình tam giác vuông ở góc trái trên");
            System.out.println("0. Thoát");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            luaChon = input.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập chiều dài");
                    int chieuDai = input.nextInt();
                    System.out.println("Nhập chiều rộng");
                    int chieuRong = input.nextInt();
                    for (int i = 1; i <= chieuDai; i++) {
                        for (int j = 1; j <= chieuRong; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều cao tam giác");
                    int chieuCao = input.nextInt();
                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao của tam giác");
                    int chieuCao2 = input.nextInt();
                    for (int i = chieuCao2; i >= 1; i--) {
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                            System.out.println("");
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn ngoài vùng");
            }
        }
    }
}
