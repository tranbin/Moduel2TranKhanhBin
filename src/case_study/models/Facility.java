package case_study.models;

public abstract class Facility {
    private String nameService;
    private int areaUsing;
    private double price;
    private int limitedPeople;
    private String typeOfFacility;

    public Facility() {
    }

    public Facility(String nameService, int areaUsing, double price, int limitedPeople, String typeOfFacility) {
        this.nameService = nameService;
        this.areaUsing = areaUsing;
        this.price = price;
        this.limitedPeople = limitedPeople;
        this.typeOfFacility = typeOfFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(int areaUsing) {
        this.areaUsing = areaUsing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLimitedPeople() {
        return limitedPeople;
    }

    public void setLimitedPeople(int limitedPeople) {
        this.limitedPeople = limitedPeople;
    }

    public String getTypeOfFacility() {
        return typeOfFacility;
    }

    public void setTypeOfFacility(String typeOfFacility) {
        this.typeOfFacility = typeOfFacility;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", areaUsing=" + areaUsing +
                ", price=" + price +
                ", limitedPeople=" + limitedPeople +
                ", typeOfFacility='" + typeOfFacility + '\'' +
                '}';
    }
}
