package ss3_array_and_method_in_java.bai_tap;

public class Bai03Gop2Mang {
    /*public static void main(String[] args) {
        int[] array_a = {1, 3, 5};
        int[] array_b = {2, 4, 6};
        int length_array_c = array_a.length + array_b.length;
        int[] array_c = new int[length_array_c];
        int temp = 0;
        for (int i = 0; i < array_a.length; i++) {
            array_c[temp] = array_a[i];
            temp++;
        }
        for (int j = 0; j < array_b.length; j++) {
            array_c[temp] = array_b[j];
            temp++;
        }
        for (int f = 0; f < array_c.length; f++) {
            System.out.println(array_c[f]);
        }

    }*/

    //c22222 dùng for each
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int length_c = a.length + b.length;
        int c[] = new int[length_c];
        int temp = 0 ;
        for (int index_a : a){
            c[temp] = index_a;
            temp++;
        }
        for(int index_b : b){
            c[temp] = index_b;
            temp++;
        }
        for (int i = 0 ; i < c.length ; i ++){
            System.out.println(c[i]);
        }
    }
}
