package ss17_io_test_file2.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static String LINK_PATH = "src/ss17_io_test_file2/bai_tap/quan_li_san_pham_luu_ra_file_nhi_phan/Product.dat";

    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        ProductControl productControl = new ProductControl();
        do {
            System.out.println("1. Thêm");
            System.out.println("2. Hiển Thị Sản Phẩm");
            System.out.println("3. Tìm Kiếm");
            System.out.println("4. Thoát");
            System.out.println("-------------------------------");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("ADD");
                    productControl.add();
                    break;
                case 2:
                    System.out.println("DISPLAY");
                    productControl.display();
                    break;
                case 3:
                    System.out.println("SEARCH");
                    productControl.search();
                    break;
                default:
                    check = false;
            }
        }
        while (check);
    }
}
