package mobile_phone_manager.Main;

import case_study.services.service_iml.EmployeeServiceImpl;
import mobile_phone_manager.service.ServiceCH;
import mobile_phone_manager.service.ServiceXT;

import java.util.Scanner;

public class Main {
    private static ServiceCH serviceCH = new ServiceCH();
    private static ServiceXT serviceXT = new ServiceXT();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("1.Thêm \n2. Hiển thị \n3.Tìm kiếm theo id \n4.Xóa theo id \n5. Thoát");
        String tmp = "";
        int choice = 0;
        do {
            System.out.print(tmp.isEmpty() ? "Input your choice: " : "Please input value from 1 to 5: ");
            tmp = sc.nextLine();
            if (isNumber(tmp)) choice = Integer.parseInt(tmp);
        } while (choice <= 0 || choice > 5);

        switch (choice) {
            case 1:
                System.out.println("-----THÊM MỚI");
                addNewPhone();
                break;
            case 2:
                System.out.println("----HIỂN THỊ");
                displayPhone();
                break;
            case 3:
                System.out.println("---TÌM KIẾM");
                searchPhone();
                break;
            case 4:
                System.out.println("---XÓA");
                deletePhone();
                break;
            case 5:
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

    public static void addNewPhone() {
        ServiceXT serviceXT = new ServiceXT();
        ServiceCH serviceCH = new ServiceCH();
        boolean check = true;
        while (check) {
            System.out.println("1. Thêm mới điện thoại xách tay");
            System.out.println("2. Thêm mới điện thoại chính hãng");
            System.out.println("3. Thoát");

            switch (sc.nextInt()) {
                case 1:
                    serviceXT.add();
                    break;
                case 2:
                    serviceCH.add();
                    break;

            }
            backToMainMenu();
            while (check) ;
        }
    }

    public static void displayPhone() {
        boolean check = true;
        while (check) {
            System.out.println("1. Hiển thị điện thoại xách tay");
            System.out.println("2. Hiển thị điện thoại chính hãng");
            System.out.println("3. Thoát");

            switch (sc.nextInt()) {
                case 1:
                    serviceXT.display();
                    break;
                case 2:
                    serviceCH.display();
                    break;

            }
            backToMainMenu();
            while (check) ;
        }
    }

    public static void searchPhone() {
        boolean check = true;
        while (check) {
            System.out.println("1. Tìm kiếm điện thoại xách tay");
            System.out.println("2. Tìm kiếm điện thoại chính hãng");
            System.out.println("3. Thoát");

            switch (sc.nextInt()) {
                case 1:
                    serviceXT.search();
                    break;
                case 2:
                    serviceCH.search();
                    break;

            }
            backToMainMenu();
            while (check) ;
        }
    }

    public static void deletePhone() {
        boolean check = true;
        while (check) {
            System.out.println("1. Xóa điện thoại xách tay");
            System.out.println("2. Xóa điện thoại chính hãng");
            System.out.println("3. Thoát");

            switch (sc.nextInt()) {
                case 1:
                    serviceXT.delete();
                    break;
                case 2:
                    serviceCH.delete();
                    break;
            }
            backToMainMenu();
            while (check) ;
        }
    }
}
