package case_study.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String male ;
    private int phone;
    private String email ;
    private String level;
    private String position;

    public Employee(int id, String name, int age, String address, String male, int phone, String email, String level, String position) {
        super(id, name, age, address);
        this.male = male;
        this.phone = phone;
        this.email = email;
        this.level = level;
        this.position = position;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" + " id "+ getId() + " name " + getName() + " age : " + getAge() + " add " + getAddress() +
                "male='" + male + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public String getInfo(){
        //int id, String name, int age, String address, String male, int phone, String email, String level, String position
        return this.getId() + "-" + this.getName() + "-" + this.getAge() + "-" + this.getAddress() + "-" + this.male
                + "-" + this.phone + "-" + this.email + "-" + this.level + "-" + this.position;
    }
}
