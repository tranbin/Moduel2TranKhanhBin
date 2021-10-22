package ss9_dsa_collection_linkedlist_set.bai_tap.my_array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    //số lượng phần tử có trong mảng myarraylist

    private int size = 0;

    // sửa chửa của My array list

    private static final int DEFAULT_CAPACITY = 10;

    // mảng chứa các phẩn tử

    Object elements[];


    // SỨC CHỨA MẶC ĐỊNH KHI KHỞI TẠO BẰNG CONSTRUCTOR KHÔNG CÓ THAM SỐ

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // phương thức constructor với sức chứa được truyền vào

    /**
     * @param capacity
     */

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity :  " + capacity);
        }
    }

    /**
     * phương thức trả về số lượng phần tử
     *
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * phương thức clear ArrayList
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
    }

    /**
     * @param element
     */
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    /**
     * Phương thức tăng kích thước của MyArrayList
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity " + minCapacity);
        }
    }

    /**
     * Phương thức lấy 1 element tại vị trí index
     *
     * @param index
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * phương thức lấy index của 1 phần tử
     *
     * @param element
     */

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    /**
     * phương thức kiểm tra 1 phần tử có trong MyArrayList hay không
     *
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    /**
     * phương thức tạo ra 1 bản sao của MyArrayList hiện tại
     *
     * @return
     */

    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;

    }

    /**
     *
     */

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index : " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
