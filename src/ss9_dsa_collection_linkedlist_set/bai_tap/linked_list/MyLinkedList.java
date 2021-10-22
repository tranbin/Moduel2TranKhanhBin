package ss9_dsa_collection_linkedlist_set.bai_tap.linked_list;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    // Phần tử đầu tiên của danh sách liên kết
    private Node head;
    // Số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        // khai báo 1 biến là temp trỏ đến giá trị của head
        Node temp = head;
        //Biến head sẽ nhận giá trị là 1 node mới.
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNodes++;

    }

    public void addLast(E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        // Sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        // Khai báo biến temp trỏ đến head
        Node temp = head;

        // Khai báo 1 node là holder
        Node holder;

        // Cho con trỏ chạy đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        // cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //Node tại vị trí index -1 sẽ trỏ tới node mới ;
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        // tăng số lượng phần tử trong danh sách lên 1
        numNodes++;
    }
    public Object get(int index){
        //Khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
                temp = temp.next;
        }
        return temp.data;
    }
}

