package ss5_access_staticMethod_staticProperty.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bin");
        student.setClasses("A07I1");
        System.out.println(student.getName() + " " +student.getClasses());
    }
}
