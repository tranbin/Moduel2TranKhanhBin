package ss17_io_test_file2.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductControl {
    public static String LINK_PATH = "src/ss17_io_test_file2/bai_tap/quan_li_san_pham_luu_ra_file_nhi_phan/Product.dat";
    private Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile list = new ReadAndWriteFile();
    List<Product> listProduct = new ArrayList<>();
    public void add(){
        System.out.println("Ban hay nhap id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Ban hay nhap ma roduct");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban hay nhap gia product ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,code,price);
        listProduct.add(product);
        list.writeFile(LINK_PATH, listProduct);

    }
    public void search(){
        System.out.println("Ban hay nhap ID");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product list1: list.readFile(LINK_PATH)){
            if(list1.getIdProduct() == id){
                System.out.println(list1);
            }
        }
    }
    public void display(){
        for (Product list: list.readFile(LINK_PATH)){
            System.out.println(list);
        }
    }
}
