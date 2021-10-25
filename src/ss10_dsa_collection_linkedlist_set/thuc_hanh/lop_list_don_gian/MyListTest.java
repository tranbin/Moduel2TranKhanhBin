package ss10_dsa_collection_linkedlist_set.thuc_hanh.lop_list_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(2);
        list.add(6);
        list.add(9);
        System.out.println("Danh sach integer da nhap la: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}