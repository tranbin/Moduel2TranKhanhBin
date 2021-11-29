package mobile_phone_manager.model;

public class ChinhHang extends MobilePhone {
    private String time ;
    private String area;

    public ChinhHang() {
    }

    public ChinhHang(String time, String area) {
        this.time = time;
        this.area = area;
    }

    public ChinhHang(int id, String name, int price, int quantity, String produce, String time, String area) {
        super(id, name, price, quantity, produce);
        this.time = time;
        this.area = area;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    //int id, String name, int price, int quantity, String produce, String time, String area
    public  String getInfo(){
        return this.getId() + "," + this.getName() + "," + this.getPrice() + ","
                + this.getQuantity() + "," + this.getProduce() + "," + this.getTime() +"," + this.getTime();
    }
}
