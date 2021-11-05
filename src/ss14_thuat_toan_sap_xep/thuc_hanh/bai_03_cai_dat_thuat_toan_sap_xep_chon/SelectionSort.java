package ss14_thuat_toan_sap_xep.thuc_hanh.bai_03_cai_dat_thuat_toan_sap_xep_chon;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min_index = list[i];   //tìm min nhỏ nhất để gim đầu mảng
            int min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min_index > list[j]) {
                    min_index = list[j];
                    min = j;
                }
            }


            if (min != i) {
                list[min] = list[i];  // sắp xếp
                list[i] = min_index;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
