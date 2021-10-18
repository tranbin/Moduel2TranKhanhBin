package ss5_access_static_method_static_property.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bin");
        student.setClasses("A07I1");
        System.out.println(student.getName() + " " +student.getClasses());
    }
}
