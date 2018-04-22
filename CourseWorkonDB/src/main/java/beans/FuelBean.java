package beans;

public class FuelBean {
    /**
     * ID топлива
     */
    private int fuelID;
    /**
     * Марка топлива
     */
    private String fuelMark;
    /**
     * Сезон топлива
     */
    private String season;

    public int getFuelID() {
        return fuelID;
    }

    public void setFuelID(int fuelID) {
        this.fuelID = fuelID;
    }

    public String getFuelMark() {
        return fuelMark;
    }

    public void setFuelMark(String fuelMark) {
        this.fuelMark = fuelMark;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


}
