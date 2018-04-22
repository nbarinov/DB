package beans;

public class BusMarksBean {
    /**
     * ID марка автобуса
     */
    private int markID;
    /**
     * Производитель
     */
    private String fabricator;
    /**
     * Количество этажей
     */
    private short numFloors;
    /**
     * Количество сидящих мест
     */
    private short seatsNumber;
    /**
     * ID топлива
     */
    private int fuelID;
    /**
     * ID масла
     */
    private int oilID;

    public int getMarkID() {
        return markID;
    }

    public void setMarkID(int markID) {
        this.markID = markID;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    public short getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(short numFloors) {
        this.numFloors = numFloors;
    }

    public short getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(short seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public int getFuelID() {
        return  fuelID;
    }

    public void setFuelID(int fuelID) {
        this.fuelID = fuelID;
    }

    public int getOilID() {
        return oilID;
    }

    public void setOilID(int oilID) {
        this.oilID = oilID;
    }
}