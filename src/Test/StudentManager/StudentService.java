package Test.StudentManager;

import java.sql.SQLOutput;
import java.util.*;

public class StudentService implements IServiceStudent {
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("------------ADD---------");
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String add = scanner.nextLine();
        System.out.println("Nhập điểm");
        int mark = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập môn học");
        String subject = scanner.nextLine();
        Student student = new Student(id, name, age, add, mark, subject);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        RWFile.write(studentList,true);
        System.out.println("Tạo thành công");
    }

    @Override
    public void display() {
        System.out.println("--------------DISPLAY-----------");
        List<Student> studentList = RWFile.read();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + "." + studentList.get(i));
        }
    }

    @Override
    public void edit() {
        //int id, String name, int age, String address, double point, String subje
        display();
        System.out.println("------EDIT----------");
        System.out.println("CHỌN SINH VIÊN CẦN EDIT");
        int index= Integer.parseInt(scanner.nextLine());
        List<Student> studentList= RWFile.read();
        System.out.println("----------Nhập tên cần sửa");
        String newName = scanner.nextLine();
        System.out.println("--------Nhập tuổi cần sửa");
        int newAge = Integer.parseInt(scanner.nextLine());
        studentList.get(index-1).setName(newName);
        studentList.get(index-1).setAge(newAge);
        RWFile.write(studentList,false);
        System.out.println("Đã chỉnh sửa");
    }

    @Override
    public void searchByName() {
        System.out.println("----------Nhập tên cần tìm kiếm");
        String searchName = scanner.nextLine();
        List<Student> studentList= RWFile.read();
        for (Student s: studentList
             ) {
            if (s.getName().contains(searchName)){
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void sortByName() {
        System.out.println("---------sắp xếp----------");
        List<Student> studentList= RWFile.read();
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        RWFile.write(studentList,false);

    }

    @Override
    public void deleteById() {
        display();
        System.out.println("-------------Chọn sinh viên cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = RWFile.read();
        studentList.remove(index-1);
        RWFile.write(studentList,false);
        System.out.println("Xóa thành công");
    }
}
