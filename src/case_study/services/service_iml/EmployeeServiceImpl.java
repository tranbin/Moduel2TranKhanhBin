package case_study.services.service_iml;

import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadWriteFileEmployee;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner sc = new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("Nhập id cho nhân viên : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên cho nhân viên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi cho nhân viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("----Đc nhân viên----");
        String addr = sc.nextLine();
        System.out.println("---GIỚI TÍNH NV");
        String male = sc.nextLine();
        System.out.println("-----SĐT NV");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.println("----Email nv");
        String email = sc.nextLine();
        System.out.println("----Trình độ");
        String level = sc.nextLine();
        System.out.println("-----vị TRí");
        String position = sc.nextLine();

        Employee employee = new Employee(id, name, age, addr, male, phone, email, level, position);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadWriteFileEmployee.write(employeeList,true);
        System.out.println("------Success!");
    }

    @Override
    public void display() {
        System.out.println("-------------Hiển thị");
        List<Employee> employeeList = ReadWriteFileEmployee.read();
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + " . " + employeeList.get(i));
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("----chọn nhân viên cần chỉnh sửa");
        int index = Integer.parseInt(sc.nextLine());
        List<Employee> employees = ReadWriteFileEmployee.read();
        System.out.println("--------Nhập tên mới");
        String newName = sc.nextLine();
        System.out.println("--------Nhập tuổi mới");
        int newAge = Integer.parseInt(sc.nextLine());
        employees.get(index-1).setName(newName);
        employees.get(index-1).setAge(newAge);
        ReadWriteFileEmployee.write(employees,false);
        System.out.println("-----Đã chỉnh sủa");
    }

    @Override
    public void delete() {
        display();
        System.out.println("------------xóa nhân viên");
        int index = Integer.parseInt(sc.nextLine());
        List<Employee> employees = ReadWriteFileEmployee.read();
        employees.remove(index-1);
        ReadWriteFileEmployee.write(employees,false);
        System.out.println("-----success!");
    }
    public void sort(){
        List<Employee> employeeList = ReadWriteFileEmployee.read();
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
        ReadWriteFileEmployee.write(employeeList,false);
    }
}
