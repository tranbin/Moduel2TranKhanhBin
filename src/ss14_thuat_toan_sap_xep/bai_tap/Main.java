package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int n;
        int array[];
        String text = "\n";
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng các phần tử của mảng 1 chiều");
        n = Integer.parseInt(input.nextLine());
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mảng có phần tử thứ " + i);
            array[i] = Integer.parseInt(input.nextLine());
            text = text + array[i] + " ";
        }
        System.out.println("Mảng bạn vừa nhập là : " + text);
        System.out.println("--------------------------------------------");
        System.out.println("Mảng tăng dần là : ");
        InsertionSort insertion = new InsertionSort();
        InsertionSort.insertionSort(array);
    }


}
