package Beans;


import java.time.LocalTime;

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
     * ВНИМАНИЕ!!!!
     * Дата технического обслуживания автобуса
     * ВНИМАНИЕ!!! ВОЗМОЖНО ПОТРЕБУЕТСЯ ИЗМЕНИТЬ ТИП ДАННЫХ!!!
     */
    private LocalTime tecService;
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

    public LocalTime getTecService() {
        return tecService;
    }

    public void setTecService(LocalTime tecService) {
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
