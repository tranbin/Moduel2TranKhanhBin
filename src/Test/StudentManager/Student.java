package Test.StudentManager;

public class Student extends Person {
    private int point ;
    private String subject ;

    public Student() {
    }

    public Student(int id, String name, int age, String address, int point, String subject) {
        super(id, name, age, address);
        this.point = point;
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", subject='" + subject + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public  String getInfo(){
        return this.id + "," + this.name + "," + this.age + ","
                + this.address + "," + this.point + "," + this.subject;
    }
}
