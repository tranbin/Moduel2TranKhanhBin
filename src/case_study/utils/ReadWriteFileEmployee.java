package case_study.utils;

import Test.StudentManager.Student;
import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileEmployee {
    final static String PATH = "src/case_study/data/employee.csv";
    public static void write(List<Employee> employeeList, boolean append){
        File file = new File(PATH);
        FileWriter fileWriter= null ;
        BufferedWriter bufferedWriter=  null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee:employeeList){
                bufferedWriter.write(employee.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> read(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader= null ;
        BufferedReader bufferedReader=  null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine())!=null){
                array = line.split("-");
                Employee employee = new Employee(Integer.parseInt(array[0]),array[1],
                        Integer.parseInt(array[2]),array[3],array[4],Integer.parseInt(array[5]),array[6],array[7],array[8]);
                employeeList.add(employee);
                //int id, String name, int age, String address,
                // String male, int phone, String email, String level, String position
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }
}
