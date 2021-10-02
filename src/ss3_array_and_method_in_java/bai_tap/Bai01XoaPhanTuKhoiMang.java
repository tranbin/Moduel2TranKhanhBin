package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Bai01XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size ;
        int [] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số lượng phần tử");
            size = scanner.nextInt();
            if (size > 20 ){
                System.out.println("Bạn đã nhập quá số lượng phần tử quy định");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0 ;
        while (i < array.length){
            System.out.println("Nhập vào phần tử thứ " + (i + 1)+ ": ");
            array[i] = scanner.nextInt();
            i ++ ;
        }
        System.out.println("Mảng đã nhập");
        for (int j = 0 ; j < array.length;j++){
            System.out.println(array[j]);
        }
        System.out.println("Nhập vào số bạn muốn thêm");
        int so = scanner.nextInt();
        System.out.println("Nhập vào vị trí bạn muốn thêm");
        int viTri = scanner.nextInt();
        for (int i = 0 ; i < array.length;i++){
            if (viTri <=1 && viTri >= array.length-1){
                System.out.println("Không chèn được");
            }else{
                for ()
            }
        }
    }
}
