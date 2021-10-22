package ss9_dsa_collection_linkedlist_set.bai_tap.linked_list;

public class TestMyLinkedList {
    class Student{
        private int id ;
        private String name;
        public Student(){
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    MyLinkedList<Student> myLinkedList = new MyLinkedList<>();

}
