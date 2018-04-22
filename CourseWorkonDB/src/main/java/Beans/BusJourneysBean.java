package Beans;

public class BusJourneysBean {
    /**
     * ID рейса
     */
    private int journeyID;
    /**
     * ID расписания
     */
    private int timetableID;
    /**
     * ID путевого листа
     */
    private int waybillID;
    /**
     * ID автобуса
     */
    private int busID;
    /**
     * Номер платформы
     */
    private short platformNumber;

    public int getJourneyID() {
        return journeyID;
    }

    public void setJourneyID(int journeyID) {
        this.journeyID = journeyID;
    }

    public int getTimetableID() {
        return timetableID;
    }

    public void setTimetableID(int timetableID) {
        this.timetableID = timetableID;
    }

    public int getWaybillID() {
        return waybillID;
    }

    public void setWaybillID(int waybillID) {
        this.waybillID = waybillID;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public short getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(short platformNumber) {
        this.platformNumber = platformNumber;
    }
}
