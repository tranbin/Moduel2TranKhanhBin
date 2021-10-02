package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Bai02TimViTriPhanTuTrongMang {
    public static void main(String[] args) {
        boolean kiemTra = false;
        String[] hocSinh = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập tên của phần tử mà bạn cần tìm");
        String nhap_Ten = scanner.nextLine();
        for (int i = 0 ; i < hocSinh.length;i++){
            if (hocSinh[i].equals(nhap_Ten)){ // hàm kiểm tra tên trong mảng có giống cái tên đã nhập hay không , đúng thì trả về true mà không đúng sẽ trả về false
                System.out.println("Vị trí của phần tử mà bạn đã nhập là " + (i + 1));
                kiemTra = true;
                break;
            }
        }
        if (kiemTra == false){
            System.out.println("Không tìm thấy phần tử mà bạn đã nhập");
        }
    }
}
