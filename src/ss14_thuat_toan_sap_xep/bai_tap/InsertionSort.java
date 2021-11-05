package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;   // 2 1 3 5 4
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
