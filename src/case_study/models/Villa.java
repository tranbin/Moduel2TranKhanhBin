package case_study.models;

public class Villa extends Facility {
    private String standardRoom;
    private int arePool;
    private int floor;

    public Villa(String nameService, int areaUsing, double price, int limitedPeople, String typeOfFacility, String standardRoom, int arePool, int floor) {
        super(nameService, areaUsing, price, limitedPeople, typeOfFacility);
        this.standardRoom = standardRoom;
        this.arePool = arePool;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getArePool() {
        return arePool;
    }

    public void setArePool(int arePool) {
        this.arePool = arePool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
