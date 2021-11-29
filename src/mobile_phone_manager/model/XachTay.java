package mobile_phone_manager.model;

public class XachTay extends MobilePhone {
    private String quocGia;
    private String trangThai;

    public XachTay() {
    }

    public XachTay(String quocGia, String trangThai) {
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public XachTay(int id, String name, int price, int quantity, String produce, String quocGia, String trangThai) {
        super(id, name, price, quantity, produce);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return super.toString() + "," + quocGia + "," + trangThai;
    }

    public String getInfo() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + ","
                + this.getQuantity() + "," + this.getProduce() + "," + this.getQuocGia() + "," + this.getTrangThai();
    }
}
