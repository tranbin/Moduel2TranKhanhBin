package case_study.models;

public class Room extends Facility {
    private String serviceFree;

    public Room(String nameService, int areaUsing, double price, int limitedPeople, String typeOfFacility, String serviceFree) {
        super(nameService, areaUsing, price, limitedPeople, typeOfFacility);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
