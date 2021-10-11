package ss6_inherictance_polymophirsm.bai_tap.Circle_Cylinder;

public class Circle {
    private double banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double dienTich(){
        return Math.pow(getBanKinh(),2)*3.14;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính là " +getBanKinh() + " có màu " + getMauSac() + " và diện tích là " + dienTich();
    }
}
