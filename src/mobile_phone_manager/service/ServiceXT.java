package mobile_phone_manager.service;

import mobile_phone_manager.model.XachTay;
import mobile_phone_manager.util.RWFileXT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceXT implements InterfaceMobile {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        //int id, String name, int price, int quantity,
        // String produce, String quocGia, String trangThai
        System.out.println("------------ADD---------");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên ĐT");
        String name = scanner.nextLine();
        System.out.println("Nhập giá ĐT");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String produce = scanner.nextLine();
        System.out.println("Nhập quốc gia");
        String country = scanner.nextLine();
        System.out.println("Nhập Trạng thái điện thoại");
        String status = scanner.nextLine();
        XachTay xachTay = new XachTay(id, name, price, quantity, produce, country,status);
        List<XachTay> xachTayList = new ArrayList<>();
        xachTayList.add(xachTay);
        RWFileXT.write(xachTayList,true);
        System.out.println("Tạo thành công");
    }

    @Override
    public void display() {
        System.out.println("--------------DISPLAY-----------");
        List<XachTay> xachTayList = RWFileXT.read();
        for (int i = 0; i < xachTayList.size(); i++) {
            System.out.println((i + 1) + "." + xachTayList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("-------------CHọn id cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<XachTay> xachTayList = RWFileXT.read();
        xachTayList.remove(index-1);
        RWFileXT.write(xachTayList,false);
        System.out.println("Xóa thành công");
    }

    @Override
    public void search() {
        System.out.println("----------Nhập id tìm kiếm");
        int searchID =Integer.parseInt(scanner.nextLine());
        List<XachTay> xachTayList= RWFileXT.read();
        for (XachTay xachTay : xachTayList){
            if (xachTay.getId() == searchID){
                System.out.println(xachTay);
            }
        }
        /*
        *   System.out.println("Ban hay nhap ID");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product list1: list.readFile(LINK_PATH)){
            if(list1.getIdProduct() == id){
                System.out.println(list1);
            }
        }*/
    }
}
