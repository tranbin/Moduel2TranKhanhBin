package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo2 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên tố bạn cần kiểm tra !");
        num = scanner.nextInt();
        if (num  < 2){
            System.out.println(num +" Không phải là số nguyên tố");
        }else{
            int i = 2 ;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(num + " Là 1 số nguyên tố");
            }else {
                System.out.println(num + " không phải là 1 số nguyên tố");
            }
        }

    }
}
