package case_study.models;

public class House extends Facility {
    private String standardRoom;
    private int numberFloor;

    public House(String nameService, int areaUsing, double price, int limitedPeople, String typeOfFacility, String standardRoom, int numberFloor) {
        super(nameService, areaUsing, price, limitedPeople, typeOfFacility);
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
