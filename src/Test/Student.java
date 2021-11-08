package Test;

public class Student extends Person {
    private String address ;
    private String subject ;
    private double mark;

    public Student() {
    }

    public Student(int id, String name, int age, String address, String subject, double mark) {
        super(id, name, age);
        this.address = address;
        this.subject = subject;
        this.mark = mark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Id : " + getId() + " -  Tên : " + getName() + " -  Địa chỉ : " + getAddress() + " -  Môn Học : " + getSubject() + " - Điểm : " + getMark() ;
    }
}
