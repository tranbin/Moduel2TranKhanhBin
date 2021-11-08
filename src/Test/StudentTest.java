package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        boolean check = true;
       ConstructorStudent c = new StudentManager();
        Scanner scanner = new Scanner(System.in);
       List<Student> list = new ArrayList<>();
       list.add(new Student(1,"Bin",18,"HUẾ","Toán",10));
       list.add(new Student(2,"An",16,"Dn","Toán",9));
         System.out.println("____________MENU______________");
        do {
            System.out.println("YOUR OPTION");
            System.out.println("----------------------------");
            System.out.println("1.Add new Product!");
            System.out.println("2.Display All Product!");
            System.out.println("3.Edit your Product!");
            System.out.println("4.Delete Product!");
            System.out.println("5.EXIT -----!");
            int choose = Integer.parseInt(scanner.nextLine());
            int index = 0 ;
            switch (choose) {
                case 1:
                    System.out.println("---------ADD---------");
                    c.add(list);
                    break;
                case 2:
                    System.out.println("---------DISPLAY--------");
                    c.display(list);
                    break;
                case 3:
                    System.out.println("---------delete--------");
                    System.out.println("Nhập vào id bạn muốn xóa");
                    index = Integer.parseInt(scanner.nextLine());
                    c.delete(list,index);
                    break;
                case 4:
                    System.out.println("---------edit--------");
                    System.out.println("Nhập vào id bạn muốn sửa");
                    index = Integer.parseInt(scanner.nextLine());
                    c.edit(list,index);
                    break;
                default:
                    check = false;
            }
        } while (check);
    }
}
