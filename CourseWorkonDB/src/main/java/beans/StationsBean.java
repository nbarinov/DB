package beans;

public class StationsBean {
    /**
     * ID станции
     */
    private int stationID;
    /**
     * Город
     */
    private String city;
    /**
     * Улица
     */
    private String street;
    /**
     * Телефонный номер
     */
    private String phoneNumber;

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
