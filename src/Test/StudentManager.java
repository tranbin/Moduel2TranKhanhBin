package Test;

import java.util.List;
import java.util.Scanner;

public class StudentManager implements ConstructorStudent {
    Scanner input = new Scanner(System.in);

    @Override
    public void add(List<Student> list) {
        System.out.println("Nhập id học sinh");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học sinh");
        String name = input.nextLine();
        System.out.println("Nhập tuổi học sinh");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Nhập địa chỉ học sinh");
        String address = input.nextLine();
        System.out.println("Nhập môn học ");
        String subject = input.nextLine();
        System.out.println("Nhập điểm học sinh");
        double mark = Double.parseDouble(input.nextLine());
        Student student = new Student(id, name, age, address, subject, mark);
        list.add(student);
    }

    @Override
    public void display(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void delete(List<Student> list, int i) {
        for (int j = 0 ; j < list.size();j++){
            if (j ==i){
                list.remove(j);
                break;
            }
        }
    }

    @Override
    public void edit(List<Student> list, int i) {
        for (int j = 0 ; j < list.size();j++){
            if (j == i){
                System.out.println("Nhập id học sinh");
                int id = Integer.parseInt(input.nextLine());
                System.out.println("Nhập tên học sinh");
                String name = input.nextLine();
                System.out.println("Nhập tuổi học sinh");
                int age = Integer.parseInt(input.nextLine());
                System.out.println("Nhập địa chỉ học sinh");
                String address = input.nextLine();
                System.out.println("Nhập môn học ");
                String subject = input.nextLine();
                System.out.println("Nhập điểm học sinh");
                double mark = Double.parseDouble(input.nextLine());

                list.get(j).setId(id);
                list.get(j).setName(name);
                list.get(j).setAge(age);
                list.get(j).setAddress(address);
                list.get(j).setSubject(subject);
                list.get(j).setMark(mark);
                break;
            }
        }
    }
}
