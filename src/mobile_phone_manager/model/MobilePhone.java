package mobile_phone_manager.model;

public abstract class MobilePhone {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private String produce;

    public MobilePhone() {
    }

    public MobilePhone(int id, String name, int price, int quantity, String produce) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.produce = produce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public String toString() {
        return " id =" + id +
                "," + " name = " + name + "," +
                " price = " + price + "," +
                " quantity = " + quantity + "," +
                " produce = " + produce;
    }
}
