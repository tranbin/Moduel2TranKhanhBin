package Test.StudentManager;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StudentService service = new StudentService();
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        System.out.println("1.Thêm \n2. Hiển thị \n3.Chỉnh sửa theo id \n4.Tìm kiếm theo tên" +
                " \n5. Sắp xếp theo tên \n6.Xóa theo Id \n7.THOÁT \n");
        String tmp = "";
        int choice = 0;
        do {
            System.out.print(tmp.isEmpty() ? "Input your choice: " : "Please input value from 1 to 7: ");
            tmp = sc.nextLine();
            if (isNumber(tmp)) choice = Integer.parseInt(tmp);
        } while (choice <= 0 || choice > 8);

        switch (choice) {
            case 1:
                service.add();
                break;
            case 2:
                service.display();
                break;
            case 3:
                service.edit();
                break;
            case 4:
                service.searchByName();
                break;
            case 5:
                service.sortByName();
                break;
            case 6:
                service.deleteById();
                break;
            case 7:
                System.exit(0);
                break;
        }
        backToMainMenu();
    }
    private static boolean isNumber(String choice) {
        try {
            Integer.parseInt(choice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static void backToMainMenu() {
        System.out.print("Do you back to main menu (Y/N): ");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("Y")) displayMainMenu();
        else System.exit(0);
    }

}
