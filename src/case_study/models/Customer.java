package case_study.models;

public class Customer extends Person {
    private String identity;
    private String male;
    private int phone ;
    private String email ;
    private String typeOfService;

    public Customer() {
    }

    public Customer(int id, String name, int age, String address, String identity,
                    String male, int phone, String email, String typeOfService) {
        super(id, name, age, address);
        this.identity = identity;
        this.male = male;
        this.phone = phone;
        this.email = email;
        this.typeOfService = typeOfService;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identity='" + identity + '\'' +
                ", male='" + male + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
    //int id, String name, int age, String address, String identity,
    //                    String male, int phone, String email, String typeOfService)
    public String getInfomation(){
        return this.getId() +","+this.getName()+","+this.getAge()+","+this.getAddress()+","+this.getIdentity()
                +","+this.getMale()+","+this.getPhone()+","+this.getEmail()+","+this.getTypeOfService();
    }
}
