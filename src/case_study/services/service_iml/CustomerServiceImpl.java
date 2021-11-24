package case_study.services.service_iml;

import case_study.services.CustormerService;

import java.util.Scanner;

public class CustomerServiceImpl implements CustormerService {
    //int id, String name, int age, String address, int identity, String male, int phone, String email, String typeOfService
    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của khách hàng ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên của khách hàng ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của khách hàng ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Địa chỉ của khách hàng ");
        String address = sc.nextLine();
        System.out.println("Nhập CMND/CĂN CƯỚC của khách hàng ");
        String identity = sc.nextLine();
        System.out.println("Nhập giới tính của khách hàng ");
        String male = sc.nextLine();
        System.out.println("Nhập Số điện thoại của khách hàng ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email của khách hàng ");
        String email = sc.nextLine();
        System.out.println("Nhập Kiểu khách hàng ");
        String type = sc.nextLine();
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
