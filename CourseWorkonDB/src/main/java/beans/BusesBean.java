package beans;

import java.sql.Date;

public class BusesBean {
    /**
     * ID автобуса
     */
    private int busID;
    /**
     * Государственный номер автобуса
     */
    private String stateNumber;
    /**
     * Пробег автобуса
     */
    private short run;
    /**
     * Дата технического обслуживания автобуса
     */
    private Date tecService;
    /**
     * Марка автобуса
     */
    private int markID;
    /**
     * Автопредприятия поставщика автобуса
     */
    private int autocompanyID;

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public short getRun() {
        return run;
    }

    public void setRun(short run) {
        this.run = run;
    }

    public Date getTecService() {
        return tecService;
    }

    public void setTecService(Date tecService) {
        this.tecService = tecService;
    }

    public int getMarkID() {
        return markID;
    }

    public void setMarkID(int markID) {
        this.markID = markID;
    }

    public int getAutocompanyID() {
        return autocompanyID;
    }

    public void setAutocompanyID(int autocompanyID) {
        this.autocompanyID = autocompanyID;
    }
}
