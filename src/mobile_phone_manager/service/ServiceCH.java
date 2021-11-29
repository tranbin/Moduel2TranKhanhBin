package mobile_phone_manager.service;


import mobile_phone_manager.model.ChinhHang;
import mobile_phone_manager.model.XachTay;
import mobile_phone_manager.util.RWFileCH;
import mobile_phone_manager.util.RWFileXT;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCH implements InterfaceMobile {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
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
        System.out.println("Nhập thời gian bảo hành");
        String time = scanner.nextLine();
        System.out.println("Nhập diện tích bảo hành");
        String area = scanner.nextLine();
        ChinhHang chinhHang = new ChinhHang(id, name, price, quantity, produce, time,area);
        List<ChinhHang> chinhHangList = new ArrayList<>();
        chinhHangList.add(chinhHang);
        RWFileCH.write(chinhHangList,true);
        System.out.println("Tạo thành công");
    }

    @Override
    public void display() {
        System.out.println("--------------DISPLAY-----------");
        List<ChinhHang> chinhHangList = RWFileCH.read();
        for (int i = 0; i < chinhHangList.size(); i++) {
            System.out.println((i + 1) + "." + chinhHangList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("-------------CHọn id cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<ChinhHang> chinhHangs = RWFileCH.read();
        for (int i = 0; i <chinhHangs.size() ; i++) {
            if (chinhHangs.get(i).getId()==index){
                chinhHangs.remove(i);
            }
        }
        RWFileCH.write(chinhHangs,false);
        System.out.println("Xóa thành công");
    }

    @Override
    public void search() {
        System.out.println("----------Nhập id tìm kiếm");
        int searchID =Integer.parseInt(scanner.nextLine());
        List<ChinhHang> chinhHangs= RWFileCH.read();
        for (ChinhHang chinhHang : chinhHangs){
            if (chinhHang.getId() == searchID){
                System.out.println(chinhHang);
            }
        }
    }
}
