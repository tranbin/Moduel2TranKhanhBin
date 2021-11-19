package Test.StudentManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWFile {
    final static String PATH = "src/Test/StudentManager/student.csv";
    public static void write(List<Student> studentList,boolean append){
        File file = new File(PATH);
        FileWriter fileWriter= null ;
        BufferedWriter bufferedWriter=  null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student:studentList){
                bufferedWriter.write(student.getInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> read(){
        List<Student> studentList = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader= null ;
        BufferedReader bufferedReader=  null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine())!=null){
                array = line.split(",");
                Student student = new Student(Integer.parseInt(array[0]),array[1],
                        Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
                studentList.add(student);
                //int id, String name, int age, String address, double point, String subje
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    return studentList;
    }
}