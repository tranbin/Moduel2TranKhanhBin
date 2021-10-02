package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Bai03TimGiaTriLonNhatTrongMang {
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
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
            i ++ ;
        }
        System.out.println("Mảng đã nhập");
        for (int j = 0 ; j < array.length;j++){
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j = 0 ; j < array.length;j++){
            if (array[j] > max){
                max = array[j];
                index += 1 ;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " tại vị trí " + index);
    }
}
