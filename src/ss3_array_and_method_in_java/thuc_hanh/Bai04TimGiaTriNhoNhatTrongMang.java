package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Bai04TimGiaTriNhoNhatTrongMang {
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
        int index = minValue(array);
        System.out.println("Min của mảng " + array[index]);
    }
    public static int minValue(int[] array){
        int index = 0 ;
        for (int i = 1; i < array.length;i++){
            if (array[index] > array[i]){
                array[index] = i;
            }
        }
        return index;
    }
}
