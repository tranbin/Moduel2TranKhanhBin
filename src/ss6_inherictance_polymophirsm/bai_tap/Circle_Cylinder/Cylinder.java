package ss6_inherictance_polymophirsm.bai_tap.Circle_Cylinder;

public class Cylinder extends Circle {
    private double chieuCao ;

    public Cylinder() {
    }

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double theTich(){
        return 3.14*Math.pow(getBanKinh(),2)*getChieuCao();
    }

    @Override
    public String toString() {
        return "Hình trụ có bán kính " + getBanKinh() + " chiều cao "
                + getChieuCao() + " màu " +getMauSac() + " và thể tích là " +theTich() ;
    }
}
